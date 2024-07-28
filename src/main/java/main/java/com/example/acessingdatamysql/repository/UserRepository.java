package main.java.com.example.acessingdatamysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.accessingdatamysql.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<User, Integer> {

    void save(main.java.com.example.acessingdatamysql.model.User n);

}