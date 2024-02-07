package com.example.live.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //this is a resource
public interface UserRepository extends JpaRepository<User, Long>{
    
}
