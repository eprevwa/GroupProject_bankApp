package com.example.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.persistence.domain.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long>{

}
