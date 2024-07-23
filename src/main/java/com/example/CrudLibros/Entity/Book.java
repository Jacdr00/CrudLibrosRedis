package com.example.CrudLibros.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "tbl_libros")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long bookId;

    private String bookName;

    private String bookGender;

    private String bookSubGender;
    
    private String bookAuthor;
    
    private Date bookDate;

}
