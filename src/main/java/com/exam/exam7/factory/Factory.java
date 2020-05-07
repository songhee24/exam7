package com.exam.exam7.factory;

import com.exam.exam7.models.Cinema;
import com.exam.exam7.models.Journal;
import com.exam.exam7.models.Restaurant;
import com.exam.exam7.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class Factory {

    public static   StructureService getStructure(String n){
        if (n.equals("R")){
            return Restaurant.getInstance();
        } else if (n.equals("C")){
            return Cinema.getInstance();
        }
        return null;
    }
}
