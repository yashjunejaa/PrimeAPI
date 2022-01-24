package com.example.prime.strategies;

import java.util.*;

public class PrimeStrategies {

	/**
	 * Identifying the prime numbers using the naive method
	 * with some small optimizations.
	 * 
	 * @param lower bound 
	 * @param upper bound
	 * @returns the list of prime numbers
	 */
	public List<Integer> naive(int lower, int upper)
	{
		List<Integer> primes = new ArrayList<>();
		for(int i=lower;i<=upper;i++)
		{
			if(isPrime(i))
				primes.add(i);
		}
		return primes;
	}

	/**
	 * Identifying the prime numbers using Sieve of Eratosthenes
	 * 
	 * @param lower
	 * @param upper
	 * @returns the list of prime numbers
	 */
	public List<Integer> eratosthenes(int lower,int upper)
	{
		// initializing the prime list
		List<Integer> primes = new ArrayList<>();
		boolean[] prime=new boolean[upper+1];
		
		// Filling whole array with true
		Arrays.fill(prime, true);
		
		prime[0]=false;
		prime[1]=false;
		
		// marking non prime prime number as false
		for(int i=2;i*i<=upper;i++)
		{
			if(prime[i])
			{
				// if i is prime then marking all the multiples of i as non prime
				// starting from i*i because all the multiple of i smaller than i*i while already be marked
				for(int j=i*i;j<=upper;j+=i)
				{
					prime[j]=false;
				}
			}
		}
		// Filling all the prime numbers in the range of from lower to upper in list
		for(int i=lower;i<=upper;i++)
		{
			if(prime[i])
				primes.add(i);
		}
		return primes;
	}

	/**
	 * Check if the given parameter is prime or not
	 * 
	 * @param n
	 * @returns whether the number is prime
	 */
	private boolean isPrime(int n)
	{
		// checking the base values
		if(n==1)
			return false;
		else if(n==2)
			return true;
		
		// return false if the number is even
		else if(n%2==0)
			return false;

		// otherwise loop through till the root of the number
		for(int i=3;i<n;i+=2)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
