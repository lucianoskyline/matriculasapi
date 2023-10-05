package com.matriculasapi.repository;

import com.matriculasapi.model.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {
}
