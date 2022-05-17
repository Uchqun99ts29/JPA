package com.example.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;


@Repository
public interface BookRepository extends JpaRepository<Book,Long> {


}
