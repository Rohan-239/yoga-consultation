package com.yoga.rohan.yogabackend.repository;
import com.yoga.rohan.yogabackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

