package com.example.spring_boot.dao;
import com.example.spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByName(String name);
//    @Modifying
//    @Query("update User u set u.name = :name where u.id = :id")
//    void update(@Param(value = "id") int id, @Param(value = "updateUser") User updateUser);

}

