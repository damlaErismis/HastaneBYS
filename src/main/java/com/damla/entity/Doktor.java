package com.damla.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "doktorlar")
public class Doktor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String ad;
    String soyad;
    String unvan;
    String bolum;

    @ManyToMany(mappedBy = "doktor")
    private List<Hasta> hasta;
}
