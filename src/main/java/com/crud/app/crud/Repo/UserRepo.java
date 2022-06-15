package com.crud.app.crud.Repo;

import com.crud.app.crud.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
