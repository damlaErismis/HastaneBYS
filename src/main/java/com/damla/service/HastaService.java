package com.damla.service;

import com.damla.entity.Hasta;
import com.damla.repository.HastaRepository;
import com.damla.util.MyFactoryService;

public class HastaService extends MyFactoryService<HastaRepository, Hasta, Long> {
    public HastaService(){
        super(new HastaRepository());
    }
}
