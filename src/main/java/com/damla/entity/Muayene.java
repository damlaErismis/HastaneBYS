package com.damla.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "muayene")
public class Muayene {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String sikayet;
    LocalDate tarih;
    LocalTime saat;
    String tani;
    String recete;
    String notlar;

    @ManyToOne
    @JoinColumn(name = "hasta_id")
    private Hasta hasta;

    @ManyToOne
    @JoinColumn(name = "doktor_id")
    private Doktor doktor;


}
