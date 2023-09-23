package com.bloodshot.blog.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface UserRespository extends JpaRepository<Users, Long> {

}
