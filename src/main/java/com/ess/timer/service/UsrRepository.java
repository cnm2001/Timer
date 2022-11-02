package com.ess.timer.service;

import com.ess.timer.domain.Usr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsrRepository extends JpaRepository<Usr, Long> {

}


