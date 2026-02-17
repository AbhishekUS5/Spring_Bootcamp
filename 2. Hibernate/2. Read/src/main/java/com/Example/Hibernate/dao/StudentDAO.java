package com.Example.Hibernate.dao;

import com.Example.Hibernate.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
}
