/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfaculty.progress.controller;

import com.itfaculty.progress.model.Doctors;
import com.itfaculty.progress.services.DoctorsServices;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
    public String LoadPage(ModelMap map) {
        return "index";
    }

}
