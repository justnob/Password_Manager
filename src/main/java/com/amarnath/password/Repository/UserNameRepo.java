package com.amarnath.password.Repository;

import com.amarnath.password.entity.UserName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserNameRepo extends JpaRepository<UserName, Integer> {
}
