package com.aula.aprendendo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.aprendendo.database.RepositoryContact;
import com.aula.aprendendo.entity.Contact;

import jakarta.persistence.Id;


@RestController
@RequestMapping("/contact") 
public class ContactRestApi {

    @Autowired
    private RepositoryContact repository;
    


    @PostMapping
    public List<Contact>listar(){
        return repository.findAll();
    }

    
    @GetMapping
    public void saveContact(@RequestBody Contact contact){
        repository.save(contact);
    }


    @PutMapping
    public void putContact(@RequestBody Contact contact){
        if(contact.getId() > 0)
        repository.save(contact);
    }

    @DeleteMapping
    public void deleteContact(@RequestBody Contact contact){
        repository.delete(contact);
    }
    




}
