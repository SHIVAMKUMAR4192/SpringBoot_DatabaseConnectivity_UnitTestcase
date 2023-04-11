package com.jpa.bootproject.repository;


import com.jpa.bootproject.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

     User findByUserId(int userId);

     @Transactional
    void deleteByUserId(int userId);
}
