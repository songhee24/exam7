package com.exam.exam7.models;


import com.exam.exam7.factory.StructureService;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Restaurant implements StructureService {
    static Restaurant instance = new Restaurant();

    Long id;
    String name;
    String address;
    String specialtyOfTheHouse;
    String page;

    public static Restaurant getInstance(){
        if (instance == null){
            instance = new Restaurant(
                    1L,
                    "navat",
                    "192.018.13",
                    "fish",
                    "localhost:666");
        }
        return instance;
    }

    @Override
    public Restaurant getInfo() {
        return getInstance();
    }
}
