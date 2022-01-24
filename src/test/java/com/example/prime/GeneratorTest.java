package com.example.prime;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.prime.strategies.Generator;

class GeneratorTest {

	Generator g;
	String[] strategies;
	

	@BeforeEach
	void setUp() throws Exception {
		g=new Generator();
		strategies = new String[2];
		strategies[0]="naive";
		strategies[1]="eratosthenes";
	}

	
	@Test
	void testprimefrom1to10() {
		for(String s: strategies)
		{
			List<Integer> primes=g.generate(s, 1, 10);
			assertEquals(4,primes.size(),s+" failed range from 1 to 10");
			assertEquals(2,primes.get(0),s+" failed range from 1 to 10");
			assertEquals(7,primes.get(primes.size()-1),s+" failed range from 1 to 10");
		}
	}
	
	@Test
	void testprimefrom2to3() {
		for(String s: strategies)
		{
			List<Integer> primes=g.generate(s, 2, 3);
			assertEquals(2,primes.size(),s+" failed range from 2 to 3");
			assertEquals(2,primes.get(0),s+" failed range from 1 to 3");
			assertEquals(3,primes.get(primes.size()-1),s+" failed range from 2 to 3");
		}
	}
	
	@Test
	void testprimefrom5to13() {
		for(String s: strategies)
		{
			List<Integer> primes=g.generate(s, 5, 13);
			assertEquals(4,primes.size(),s+" failed range from 5 to 13");
			assertEquals(5,primes.get(0),s+" failed range from 5 to 13");
			assertEquals(13,primes.get(primes.size()-1),s+" failed range from 5 to 13");
		}
	}
	
	@Test
	void testprimefrom0to100() {
		for(String s: strategies)
		{
			List<Integer> primes=g.generate(s, 0, 100);
			assertEquals(25,primes.size(),s+" failed range from 0 to 100");
			assertEquals(2,primes.get(0),s+" failed range from 0 to 100");
			assertEquals(97,primes.get(primes.size()-1),s+" failed range from 0 to 100");
		}
	}
	
	@Test
	void testprimefrom200to1000() {
		for(String s: strategies)
		{
			List<Integer> primes=g.generate(s,200, 1000);
			assertEquals(122,primes.size(),s+" failed range from 200 to 1000");
			assertEquals(211,primes.get(0),s+" failed range from 200 to 1000");
			assertEquals(997,primes.get(primes.size()-1),s+" failed range from 200 to 1000");
		}
	}
	
	@Test
	void testprimefrom700to9999() {
		for(String s: strategies)
		{
			List<Integer> primes=g.generate(s, 700, 9999);
			assertEquals(1104,primes.size(),s+" failed range from 700 to 9999");
			assertEquals(701,primes.get(0),s+" failed range from 700 to 9999");
			assertEquals(9973,primes.get(primes.size()-1),s+" failed range from 700 to 9999");
		}
	}
	
	

}
