package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.CATEGORY;
import com.app.entities.Railway;

public interface RailwayRepository extends JpaRepository<Railway, Long> {

	List<Railway> findByCategory(CATEGORY category);
}
