package com.example.prime.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.prime.model.Log;
import com.example.prime.repository.LogRepository;

/**
 * 
 * Prime Service class to help interact with the database
 *
 */
@Service
public class LogService {

	private LogRepository logRepository;

	public LogService(LogRepository logRepository) {
		super();
		this.logRepository = logRepository;
	}

	/**
	 * Saves the prime object into the database
	 * 
	 * @param log object
	 * @return
	 */
	public void save(Log l) {
		logRepository.save(l);	
	}
	
	/**
	 * Returns the list of Prime objects stored in the database
	 * 
	 * @returns the list of prime objects from the database using repository
	 */
	public List<Log> getAll() {
		return logRepository.findAll();
	}
	
}
