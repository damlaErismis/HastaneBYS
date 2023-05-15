package com.damla.repository;

import com.damla.entity.Doktor;
import com.damla.util.MyFactoryRepository;

public class DoktorRepository extends MyFactoryRepository<Doktor, Long> {
    public DoktorRepository(){
        super(new Doktor());
    }
}
