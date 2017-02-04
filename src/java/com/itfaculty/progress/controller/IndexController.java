/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dineshonjaval.progress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Praneeth
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String LoadPage(ModelMap map) {
        return "redirect:/addCategory";
    }
}
