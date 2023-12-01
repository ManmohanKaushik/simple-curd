package com.bikkadit.controller;

import com.bikkadit.entity.Personal;
import com.bikkadit.services.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class PersonalController {
    @Autowired
    private Service service;
    @PostMapping("/cre")
    public ResponseEntity<Personal> createPersonalData(@RequestBody Personal personal){
        Personal personal1 = this.service.savePersonalData(personal);
        log.info("Data Save Successfully");
        return new ResponseEntity<Personal>(personal1, HttpStatus.CREATED) ;
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Personal> getId(@PathVariable Integer id){
        Personal id1 = this.service.getPersonalDataById(id);
        log.info("Get Data By Id Successfully");
        return new ResponseEntity<Personal>(id1,HttpStatus.OK) ;
    }
}
