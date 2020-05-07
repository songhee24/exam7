package com.exam.exam7.controllers;

import com.exam.exam7.factory.Factory;
import com.exam.exam7.models.Journal;
import com.exam.exam7.models.Restaurant;
import com.exam.exam7.factory.StructureService;
import com.exam.exam7.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/res")
public class RestaurantController {

    @Autowired
    private JournalService journalService;

/*    @GetMapping("/code")
     public StructureService getResByCode(@RequestParam String n){ ;
          return Factory.getStructure(n);
      }*/

    @GetMapping("/code")
    public StructureService getResByCode(@RequestParam String n){
        return journalService.getInfo(n);
    }


/*      @PostMapping("/code")
      public Journal create(@RequestBody Journal journal,@RequestParam String n){
          return journalService.create(journal, n);
      }*/
}
