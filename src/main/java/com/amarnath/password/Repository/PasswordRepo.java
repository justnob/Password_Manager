package com.amarnath.password.Repository;

import com.amarnath.password.entity.Password;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordRepo extends JpaRepository<Password, Integer> {
}
