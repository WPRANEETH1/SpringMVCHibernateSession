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
 * @author Praneeth Madusanka
 */
@Controller
@RequestMapping("/")
public class DoctorController {

    @Autowired
    private DoctorsServices doctorsServices;

    @RequestMapping(value = {"/ui-regdoc"}, method = RequestMethod.GET)
    public String LoadRegDoctorPage(ModelMap map) {
        Doctors doctors = new Doctors();
        map.addAttribute("docReg", doctors);
        return "ui-regdoc";
    }

    @RequestMapping(value = {"/ui-regdoc"}, method = RequestMethod.POST)
    public String SaveRegDoctorPage(Doctors doctors, ModelMap map) {
        doctorsServices.addDoctors(doctors);
        return "success";
    }
}
