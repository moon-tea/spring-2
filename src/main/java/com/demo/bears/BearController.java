package com.demo.bears;

import com.demo.bears.Bear;
import com.demo.bears.IBearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BearController {

    @Autowired
    private IBearService bearService;

    @GetMapping("/bears")
    public String findBears(Model model) {
        var bears = (List<Bear>) bearService.findAll();
        model.addAttribute("bears", bears);
        return "showBears";
    }
}