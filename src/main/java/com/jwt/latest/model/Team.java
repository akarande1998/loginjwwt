package com.jwt.latest.model;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="ttv_teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "code")
    private String code;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "user_role")
    private Long userRole;

    @Column(name = "address_line1",length = 65535)
    private String addressLine1;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "district")
    private String district;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "password")
    private String password;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "createdby")
    private Long createdBy;

    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "is_active")
    private Boolean isActive=true;

    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted;

    @Column(name = "refferal_code")
    private String refferalCode;

    @Column(name = "user_referral_code")
    private String userReferralcode;

    @Column(name = "fcm_token")
    private String fcmToken;

    @Column(name = "is_online")
    private Boolean isOnline;

    @Transient
    private String name;

    @Transient
    private String role;

}
