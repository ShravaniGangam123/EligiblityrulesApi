package com.shravani.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shravani.bindings.BatchSummery;

@Repository
public interface BatchSummeryRepo extends JpaRepository<BatchSummery, Serializable>{

}
