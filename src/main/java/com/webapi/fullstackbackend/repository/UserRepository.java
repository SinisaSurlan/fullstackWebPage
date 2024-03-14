package com.webapi.fullstackbackend.repository;

import com.webapi.fullstackbackend.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserData, Long> {
}
