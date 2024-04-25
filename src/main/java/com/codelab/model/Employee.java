package com.codelab.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMPLOYEE-CRUD-TBL")
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private Double salary;


}
