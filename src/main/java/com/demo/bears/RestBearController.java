package com.demo.bears;

import com.demo.bears.Bear;
import com.demo.bears.BearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class RestBearController {

    @Autowired
    private BearService bearService;

    @GetMapping("/bears.json")
    public List getAllBears() {
        return bearService.findAll();
    }

    @RequestMapping(value="/bearCreate", method = RequestMethod.POST)
    public void createBear(@RequestBody Bear bear) {
        bearService.createBear(bear);
    }
}