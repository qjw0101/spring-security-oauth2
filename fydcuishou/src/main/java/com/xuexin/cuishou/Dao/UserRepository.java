package com.xuexin.cuishou.Dao;

import com.xuexin.cuishou.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by Chandler on 2017/5/11.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "FROM User WHERE enabled > 0 and  username like ?1")
    User findOneByUsername(String username);

}
