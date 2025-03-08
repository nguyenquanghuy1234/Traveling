package com.mycompany.traveling.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mycompany.traveling.model.entity.user.*;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
   
}
