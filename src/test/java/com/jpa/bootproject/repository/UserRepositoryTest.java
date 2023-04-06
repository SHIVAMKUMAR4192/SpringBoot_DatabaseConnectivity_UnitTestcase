package com.jpa.bootproject.repository;

import com.jpa.bootproject.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findByUserId() {
     User user=new User(5,"Shivam kumar",45999.12,"software engineer");
     User savedUser = userRepository.save(user);
     User user1=new User(6,"Shubham kumar",56789.1,"Doctor");
     User savedUser1 =userRepository.save(user1);
        User actualResult = userRepository.findByUserId(5);
        assertEquals(savedUser.getUserName(), actualResult.getUserName());
        User actualresult1 =userRepository.findByUserId(6);
        assertEquals(savedUser1.getUserName(), actualresult1.getUserName());

    }
}