package com.cab_book.cab_book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cab_book.cab_book.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}