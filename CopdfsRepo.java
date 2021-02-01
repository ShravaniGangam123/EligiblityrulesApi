package com.shravani.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shravani.bindings.Copdfs;

@Repository
public interface CopdfsRepo extends JpaRepository<Copdfs, Serializable> {

}
