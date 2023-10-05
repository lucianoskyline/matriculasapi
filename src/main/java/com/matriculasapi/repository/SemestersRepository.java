package com.matriculasapi.repository;

import com.matriculasapi.model.Semesters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemestersRepository extends JpaRepository<Semesters, Integer> {
}
