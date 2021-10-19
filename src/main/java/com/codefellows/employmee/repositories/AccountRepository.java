package com.codefellows.employmee.repositories;


import com.codefellows.employmee.models.Account;
import com.codefellows.employmee.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
    Candidate findByLanguage(String language);
}
