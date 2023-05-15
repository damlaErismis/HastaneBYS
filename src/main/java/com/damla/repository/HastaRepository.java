package com.damla.repository;

import com.damla.entity.Hasta;
import com.damla.util.MyFactoryRepository;

public class HastaRepository extends MyFactoryRepository<Hasta, Long> {
    public HastaRepository(){
        super(new Hasta());
    }
}
