package com.damla.service;

import com.damla.entity.Doktor;
import com.damla.repository.DoktorRepository;
import com.damla.util.MyFactoryService;

public class DoktorService extends MyFactoryService<DoktorRepository, Doktor, Long> {

    public DoktorService(){
        super(new DoktorRepository());
    }
}
