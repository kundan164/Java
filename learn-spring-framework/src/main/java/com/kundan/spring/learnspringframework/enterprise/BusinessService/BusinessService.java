package com.kundan.spring.learnspringframework.enterprise.BusinessService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kundan.spring.learnspringframework.enterprise.Data.DataService;

@Component
public class BusinessService {
    @Autowired                                           // Field Injection
    private DataService dataService;

    //@Autowired                                           // Setter Injection
     public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }

                                                  // Constructor Injection
    public BusinessService(DataService dataService) {
        System.out.println("Constructor Injection");
        this.dataService = dataService;
    }



    public long calculateSum() {
        List<Integer> data = dataService.getData();

        return data.stream().reduce(Integer::sum).get();
    }
}
