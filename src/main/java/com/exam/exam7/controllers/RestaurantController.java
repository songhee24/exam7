package com.exam.exam7.controllers;

import com.exam.exam7.factory.Factory;
import com.exam.exam7.models.Restaurant;
import com.exam.exam7.factory.StructureService;
import com.exam.exam7.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/res")
public class RestaurantController {
      @Autowired
      private RestaurantService restaurantService;

       Factory factory = new Factory();


      @GetMapping("/code")
     public StructureService getResByCode(@RequestParam String n){
          StructureService structureService = factory.getStructure(n);
          return structureService.getInfo();
      }

      @GetMapping
      public List<Restaurant> getAll(){
          return restaurantService.getAll();
      }

      @PostMapping
      public Restaurant save(@RequestBody Restaurant restaurant){
          return restaurantService.save(restaurant);
      }

}
