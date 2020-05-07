package com.exam.exam7.models;


import com.exam.exam7.factory.StructureService;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Restaurant implements StructureService {
    static  Restaurant instance = new Restaurant();
    Long id;
    String name;
    String address;
    String specialtyOfTheHouse;
    String page;


/*
    public Restaurant(){
        id = 1L;
        name = "navat";
        address = "192.018.13";
        specialtyOfTheHouse = "fish";
        page = "localhost:666";
    }*/

    public static Restaurant getInstance(){
        if (!(instance == null)){
            instance = new Restaurant(
                    1L,
                    "navat",
                    "192.018.13",
                    "fish",
                    "localhost:666");
        }
        return instance;
    }

/*       public static StructureService getInfo(){
           return getInstance();
       }*/

}
