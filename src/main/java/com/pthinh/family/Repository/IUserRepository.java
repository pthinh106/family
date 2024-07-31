package com.pthinh.family.Repository;


import com.pthinh.family.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);

    Optional<User> findByPhoneNumber(String phone);

    Optional<User> findByPhoneNumberOrEmail(String phoneNumber, String email);
    boolean existsByPhoneNumber(String phone);
    Optional<User> findByVerificationCode(String code);
}

