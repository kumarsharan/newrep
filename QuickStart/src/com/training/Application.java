package com.training;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Vishal","Vikash");
		System.out.println(nameList);
		
		
		for(String eachItem:nameList) {
			System.out.println(eachItem);
		}
		
		Book java = new Book(112, "Mastering Java");
		System.out.println(java.getBookName());
	}

}
