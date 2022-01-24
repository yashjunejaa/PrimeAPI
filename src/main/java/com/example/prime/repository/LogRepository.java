package com.example.prime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prime.model.Log;

/**
 * Prime Repository extends the Jpa Repository which 
 * helps in interacting with the datasource
 *
 */
public interface LogRepository  extends JpaRepository<Log, Long>{

}
