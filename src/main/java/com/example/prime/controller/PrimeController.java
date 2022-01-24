package com.example.prime.controller;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.prime.model.Log;
import com.example.prime.service.LogService;
import com.example.prime.strategies.Generator;
@RestController
public class PrimeController {

	private LogService logService;

	public PrimeController(LogService logService) {
		super();
		this.logService = logService;
	}

	/**
	 * RestAPI for getting the list of numbers 
	 * 
	 * @param strategy
	 * @param lower bound
	 * @param upper bound
	 * @returns the list of prime numbers
	 */
	@GetMapping("/prime")
	public List<Integer> getPrime(@RequestParam("strategy") String strategy, 
			@RequestParam("lower") int lower, 
			@RequestParam("upper") int upper) {
		
		// declaring a log object 
		Log l = new Log();
		
		// setting the timestamp, strategy and the range
		l.setTimestamp(Timestamp.from(Instant.now()));
		int[] range = new int[2];
		range[0] = lower;
		range[1] = upper;
		l.setRange(range);
		l.setStrategy(strategy);
		
		
		long start = System.currentTimeMillis();
		// calling the generator method to get the list of primes using 
		// the proper algorithm
		Generator g=new Generator();
		List<Integer> primes=g.generate(strategy, lower, upper);
		long end = System.currentTimeMillis();
		l.setElapsedTime((end - start)/1000.0);
		l.setNumberOfPrimes(primes.size());
		
		// saving the object to database using log Service
		logService.save(l);
		return primes;
	}
	
	/**
	 * Gives the list of objects stored in the database
	 * 
	 * @returns the list of prime objects
	 */
	@GetMapping("/database")
	public List<Log> getDatabase(){
		return logService.getAll();
	}
	
	
}
