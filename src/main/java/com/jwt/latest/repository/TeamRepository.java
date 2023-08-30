package com.jwt.latest.repository;


import com.jwt.latest.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {
    Team findByEmailIgnoreCaseAndIsDeleted(String s, boolean b);

    Team findByMobileNumber(String s);
}
