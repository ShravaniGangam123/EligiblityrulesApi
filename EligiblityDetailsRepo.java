package com.shravani.repository;


import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shravani.bindings.Eligibilitydetails;


@Repository
public interface EligiblityDetailsRepo extends JpaRepository<Eligibilitydetails , Id>{


}
