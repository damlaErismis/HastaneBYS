package com.damla.repository;

import com.damla.entity.Tahlil;
import com.damla.util.MyFactoryRepository;

public class TahlilRepository extends MyFactoryRepository<Tahlil, Long> {

    public TahlilRepository(){
        super(new Tahlil());
    }
}
