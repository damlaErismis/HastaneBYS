package com.damla.service;

import com.damla.entity.Tahlil;
import com.damla.repository.TahlilRepository;
import com.damla.util.MyFactoryService;

public class TahlilService extends MyFactoryService<TahlilRepository, Tahlil, Long> {
    public TahlilService(){
        super(new TahlilRepository());
    }
}
