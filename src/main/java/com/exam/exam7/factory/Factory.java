package com.exam.exam7.factory;

import com.exam.exam7.models.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;

public class Factory {

    @Autowired
    private Restaurant restaurant =  Restaurant.getInstance();

    public StructureService getStructure(String n){
        if (n.equals("R")) {
            return  restaurant;
        } else throw new RuntimeException("error");
    }
}
