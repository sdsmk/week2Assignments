package Day2Assignments;

import java.util.*; 

public class ReduceEgN3 { 

	public static void main(String[] args) 
	{  
		HashSet<Integer> words= new HashSet<Integer>();
		words.add(12);
		words.add(4);
		words.add(10);
		words.add(3);
		
		Optional<Integer> longestString = words.stream().reduce((word1, word2)-> {
								return word1 > word2 ? word2 : word1;
							}); 
		System.out.println("Minimum price of product:::");
		longestString.ifPresent(System.out::println); 
		Integer str = longestString.get();
	} 
} 
