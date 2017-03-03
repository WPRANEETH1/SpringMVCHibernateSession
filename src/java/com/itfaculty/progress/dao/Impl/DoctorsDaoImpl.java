/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfaculty.progress.dao.Impl;

import com.itfaculty.progress.dao.DoctorsDao;
import com.itfaculty.progress.model.Doctors;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Praneeth Madusanka
 */
@Repository("doctorsDao")
public class DoctorsDaoImpl implements DoctorsDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addDoctors(Doctors doctors) {
        sessionFactory.getCurrentSession().saveOrUpdate(doctors);
    }

}
