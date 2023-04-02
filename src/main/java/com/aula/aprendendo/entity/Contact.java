package com.aula.aprendendo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // mapeando entidade - contact

public class Contact {
    
    // classificando id como -> primary key
    // sera gerado o id por auto incremento, uma vez usando o mysql
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long Id;
    
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String urlAvatar;





}
