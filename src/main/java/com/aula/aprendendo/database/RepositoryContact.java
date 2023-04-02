package com.aula.aprendendo.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.aprendendo.entity.Contact;

public interface RepositoryContact extends JpaRepository <Contact,Long>{
    
}
