package com.damla.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "hastalar")
public class Hasta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String ad;
    String soyad;
    String tcno;

    @Enumerated(EnumType.STRING)
    @Column(name = "cinsiyet")
    private ECinsiyet cinsiyet;

    int yas;
    double kilo;
    int boy;
    boolean sigortaDurumu;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "hasta-doktor", joinColumns = @JoinColumn(name = "hasta_id"),
            inverseJoinColumns = @JoinColumn(name = "doktor_id"))
    private List<Doktor> doktor;
}
