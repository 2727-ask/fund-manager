package com.wu.app.fundAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import com.wu.app.fundAPI.Repo.*;
import com.wu.app.fundAPI.Models.*;
import java.util.*;

@RestController
public class FundController {


    @Autowired
    private FundRepo fundRepo;

    @GetMapping("/")
    public String getPage(){
        return "Welcome To Fund Manager";
    }

    @GetMapping(value="/rest-sample/rest/funds")
    public List<Fund> getFunds(){
        return this.fundRepo.findAll();
    }

    @GetMapping(value="/rest-sample/rest/funds/{id}")
    public Fund getFundById(@PathVariable long id){
        Fund pfund = this.fundRepo.findById(id).get();
        return pfund;
    }

    @PostMapping(value="/rest-sample/rest/funds")
    public Fund addFund(@RequestBody Fund fund){
        this.fundRepo.save(fund);
        return fund;
    }

    @PutMapping(value="/rest-sample/rest/funds/{id}")
    public Fund updateFund(@PathVariable long id, @RequestBody Fund fund){
        Fund pfund = this.fundRepo.findById(id).get();
        pfund.setFundDescription(fund.getFundDescription());
        pfund.setOfferzprice(fund.getOfferzprice());
        pfund.setBidPrice(fund.getBidPrice());
        pfund.setLastUpdated(fund.getLastUpdated());
        this.fundRepo.save(pfund);
        return pfund;
    }


    @DeleteMapping(value="/rest-sample/rest/funds/{id}")
    public String deleteFund(@PathVariable long id){
        Fund pfund = this.fundRepo.findById(id).get();
        this.fundRepo.delete(pfund);
        return "Fund Deleted Successfully";
    }







}
