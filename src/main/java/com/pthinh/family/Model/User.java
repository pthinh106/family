package com.pthinh.family.Model;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.*;

@Entity
@Setter
@Getter
@Table(name = "table_users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "first_name", columnDefinition = "varchar(255) NOT NULL")
    private String firstName;

    @Column(name = "last_name", columnDefinition = "varchar(255) NOT NULL")
    private String lastName;

    @Column(name = "email", columnDefinition = "varchar(255)")
    private String email;

    @Column(name = "phone", columnDefinition = "varchar(11)")
    private String phoneNumber;

    @Column(name = "birth_date")
    private Date birthDay;

    @Column(name = "address", columnDefinition = "varchar(255)")
    private String address;

    @Column(name = "password", columnDefinition = "varchar(255) NOT NULL")
    private String password;

    @Column(name = "verification_code", columnDefinition = "varchar(255)")
    private String verificationCode;

    @Column(name = "forget_token", columnDefinition = "varchar(255)")
    private String forgetToken;

    @Column(name = "access_token", columnDefinition = "varchar(255)")
    private String accessToken;

    @Column(name = "refresh_token", columnDefinition = "varchar(255)")
    private String refreshToken;

    @Column(name = "register_token", columnDefinition = "varchar(255)")
    private String registerToken;

    @Column(name = "lock_status", columnDefinition = "tinyint(1) default 0")
    private Integer lockStatus = 0;

    @Column(name = "time_lock_start", columnDefinition = "TIMESTAMP default NULL")
    private Date timeLockStart;

    @Column(name = "time_lock_end", columnDefinition = "TIMESTAMP default NULL")
    private Date timeLockEnd;

    @Column(name = "count_try_login", columnDefinition = "int(1) default 0")
    private Integer countTryLogin = 0;

    @Column(name = "account_status", columnDefinition = "tinyint(1) default 0")
    private Integer accountStatus = 0;

    @Column(name = "created_on", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp()
    private Timestamp createdOn;

    @Column(name = "updated_on", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @UpdateTimestamp()
    private Timestamp updatedOn;
}
