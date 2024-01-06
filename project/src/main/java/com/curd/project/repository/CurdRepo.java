package com.curd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.project.model.Curd;

public interface CurdRepo extends JpaRepository<Curd, Integer> {
}
