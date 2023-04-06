package com.jpa.bootproject.repository;


import com.jpa.bootproject.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

     User findByUserId(int userId);
}
