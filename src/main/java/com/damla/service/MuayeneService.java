package com.damla.service;

import com.damla.entity.Muayene;
import com.damla.repository.MuayeneRepository;
import com.damla.util.MyFactoryService;

public class MuayeneService extends MyFactoryService<MuayeneRepository, Muayene, Long> {
    public MuayeneService(){
        super(new MuayeneRepository());
    }
}
