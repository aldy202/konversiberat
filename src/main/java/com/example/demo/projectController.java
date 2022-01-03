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


/**
 *
 * @author hp
 */
@Controller
public class projectController {
    ArithmaticController formula = new ArithmaticController();
    
    @RequestMapping("/tambah")
    public String penjumlahan(Model model){
        int a,b,ad;
        String tampila;
        a = 20;
        b = 56;
        ad = formula.getAdd(a, b);
        tampila = "penjumlahan " + a + " + " + b + " = " + ad;
        model.addAttribute("hasil", tampila);
        return "tampilkanHasil";
    }
    @RequestMapping("/kurang")
    public String pengurangan(Model model){
        int a,b,png;
        String tampilb;
        a = 40;
        b = 27;
        png = formula.getSub(a, b);
        tampilb = "pengurangan " + a + " - " + b + " = " + png;
        model.addAttribute("b", tampilb);
        return "tampilkanHasil";
    }
    @RequestMapping("/kali")
    public String perkalian(Model model){
        int a,b,kali;
        String tampilc;
        a = 40;
        b = 27;
        kali = formula.getTime(a, b);
        tampilc = "perkalian " + a + " * " + b + " = " + kali;
        model.addAttribute("c", tampilc);
        return "tampilkanHasil";
    }
    @RequestMapping("/bagi")
    public String pembagian(Model model){
        int a,b;
        float bagi;
        String tampild;
        a = 40;
        b = 27;
        bagi = formula.getDiv(a, b);
        tampild = "pembagian " + a + " / " + b + " = " + bagi;
        model.addAttribute("d", tampild);
        return "tampilkanHasil";
    }
    
}
