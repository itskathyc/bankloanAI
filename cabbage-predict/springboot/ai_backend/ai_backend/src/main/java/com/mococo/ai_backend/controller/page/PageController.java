package com.mococo.ai_backend.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String predict(){return "main/mainPage";}

    @GetMapping("/bankloan-dti")
    public String predictBank(){return "main/bankloan_dti";}

    @GetMapping("/bankloan-cg")
    public String predcitCg(){return "main/bankloan_cg";}




    /*  @GetMapping("/")
    public String pageMain(){
        return "main/practice/main";
    }

    @GetMapping("/uiPage")
    public String pageIndex() {
        return "main/practice/index";

   @GetMapping("/cabbage")
    public String predictCabb(){return "main/cabbage";}
    */

}
