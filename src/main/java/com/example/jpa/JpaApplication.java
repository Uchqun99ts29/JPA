package com.example.jpa;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

@SpringBootApplication
@OpenAPIDefinition
public class JpaApplication {


    public static void main(String[] args) {

        System.out.println(Objects.hash("c"));

        //  SpringApplication.run(JpaApplication.class, args);


    }

}
