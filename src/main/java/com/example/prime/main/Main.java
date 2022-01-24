package com.example.prime.main;

import java.util.List;

import com.example.prime.strategies.Generator;

public class Main {

	public static void main(String[] args) {

		// checking if the number of arguments are less than 3
		// if so, error message is printed
		if(args.length<3)
		{
			System.out.println("Insufficient arguments");
			System.exit(0);
		}
		
		// extracting input from the arguments
		String strategy=args[0];
		int lower=Integer.parseInt(args[1]);
		int upper=Integer.parseInt(args[2]);
		
		//Initializing generator to generate list of prime number
		Generator g=new Generator();
		List<Integer> prime=g.generate(strategy, lower, upper);
		for (int i:prime) 
		{
			System.out.print(i+" ");
		}
	}

}
