package com.exam.exam7.models;

import com.exam.exam7.factory.StructureService;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cinema  implements StructureService {
    static Cinema instance = new Cinema();
    Long id;
    String name;
    String address;
    Integer capacity;
    String site;

    public static Cinema getInstance(){
        if (!(instance == null)){
            instance = new Cinema(
                    2L,
                    "Cinema",
                    "192.018.13",
                    123,
                    "localhost:666");
        }
        return instance;
    }

}
