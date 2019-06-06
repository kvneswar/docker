package com.example.containerization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ContainerizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContainerizationApplication.class, args);
    }

}

@RestController
class PersonController{

    @GetMapping("/")
    public Person etPerson(){
        return new Person("Eswar", "Karumuri");
    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person{

    private String firstName, lastName;

}


