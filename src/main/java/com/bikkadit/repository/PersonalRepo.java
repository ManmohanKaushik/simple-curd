package com.bikkadit.repository;

import com.bikkadit.entity.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepo extends JpaRepository<Personal ,Integer> {
}
