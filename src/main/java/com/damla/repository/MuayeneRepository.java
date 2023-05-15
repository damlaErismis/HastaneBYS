package com.damla.repository;

import com.damla.entity.Muayene;
import com.damla.util.MyFactoryRepository;

public class MuayeneRepository extends MyFactoryRepository<Muayene, Long> {
    public MuayeneRepository(){
        super(new Muayene());
    }
}
