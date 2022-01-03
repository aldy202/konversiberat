/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class beratController {
    Konversi berat = new Konversi();
    @RequestMapping("/aldy")
    public String kilogram(Model model,HttpServletRequest data){
        int tampila;
        String hasila,hasilb,hasilc;
        float tampilb,tampilc;
        
        String x = data.getParameter("input");
        Integer ax = Integer.valueOf(x);
        
        tampila = berat.kilogram(ax);
        hasila = ax + " Kilogram = " + tampila + " Gram";
        
        tampilb = berat.gram(ax);
        hasilb = ax + " gram = " + tampilb + " kilogram";
        
        tampilc = berat.miligram(ax);
        hasilc = x + " miligram = " + tampilc + " centigram";
        
        
        model.addAttribute("ax", hasila);
        model.addAttribute("bx", hasilb);
        model.addAttribute("cx", hasilc);
        
        return "tampilkanBerat";
    }
}
