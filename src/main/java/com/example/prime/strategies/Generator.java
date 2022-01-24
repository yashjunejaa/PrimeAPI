package com.example.prime.strategies;

import java.util.*;

public class Generator {

	public List<Integer> generate(String strategy, int lower, int upper)
	{
		// declaring a prime generator object to initialize 
		// according to the algorithm selected
		List<Integer> primes=new ArrayList<>();
		PrimeStrategies ps= new PrimeStrategies();
		
		// conditions to check the algorithm
		switch(strategy)
		{
		case "naive":
			primes=ps.naive(lower, upper);
			break;
		case "eratosthenes":
			primes=ps.eratosthenes(lower, upper);
			break;
		default:
			System.out.println("Invalid strategy");
		}
		return primes;
	}
}
