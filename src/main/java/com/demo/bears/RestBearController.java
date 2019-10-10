package com.demo.bears;

import com.demo.bears.Bear;
import com.demo.bears.IBearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class RestBearController {

    @Autowired
    private IBearService bearService;

    @GetMapping("/bears.json")
    public List getAllBears() {
        return bearService.findAll();
    }
}