package com.studentmanagementsystem.studentmanagementsystem.model;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String firstName;
    private String lastName;

    private String email;

    private String phone;

    @Column(nullable = false, updatable = false)
    private String studentCode;

}
