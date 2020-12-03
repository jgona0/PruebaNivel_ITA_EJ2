package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersApp {

	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		getEvenNumbers(lista).forEach(System.out::println);
		
	}
	
	
	//Gets a list of Integers and returns even numbers
	public static List<Integer> getEvenNumbers (List<Integer> lista) {
		
		return 
			lista.stream()					//convert list to stream
			.filter(x -> x%2 == 0)			//filter 
			.collect(Collectors.toList());	//collect to List
		
	}
	
	
}
