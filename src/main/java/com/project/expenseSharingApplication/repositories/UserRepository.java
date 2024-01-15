package com.project.expenseSharingApplication.repositories;

import com.project.expenseSharingApplication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {



}
