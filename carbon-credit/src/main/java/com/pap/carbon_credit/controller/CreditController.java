package com.pap.carbon_credit.controller;

import com.pap.carbon_credit.model.Credit_Item;
import com.pap.carbon_credit.repo.CreditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/credit")
public class CreditController {
    @Autowired
    private CreditRepo creditRepo;
    @GetMapping
    public List<Credit_Item> findAll(){
        System.out.println("222222-----");
        return creditRepo.findAll();
    }
    @PostMapping
    public Credit_Item save(@RequestBody Credit_Item creditItem){
        System.out.println("=========================9999=====");
        return creditRepo.save(creditItem);
    }
}
