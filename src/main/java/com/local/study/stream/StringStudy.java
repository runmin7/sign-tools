package com.local.study.stream;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class StringStudy {

	public static void main(String[] args) {

		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
//	
//		myList
//			.stream()
//			.filter(s -> s.startsWith("c"))
//			.map(String::toUpperCase)
//			.sorted()
//			.forEach(System.out::println);
//		
		
		Arrays.asList("a1", "a2", "a3", "a3")
	    .stream()
	    .findFirst()
	    .ifPresent(System.out::println);
	}

	public void test1() {
		// TODO Auto-generated method stub

	}
	
}
