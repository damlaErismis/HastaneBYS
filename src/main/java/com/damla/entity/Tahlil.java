package com.damla.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tahliller")
public class Tahlil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String ad;
    LocalDate tarih;
    String tahlilSonucu;
}
