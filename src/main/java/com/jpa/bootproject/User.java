package com.jpa.bootproject;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Builder
//@Data
public class User {
    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer userId;
    String userName;
    Double userSalary;
    String userDept;

//    public User(Integer userId, String userName, Double userSalary, String userDept) {
//        this.userId = userId;
//        this.userName = userName;
//        this.userSalary = userSalary;
//        this.userDept = userDept;
//    }



}
