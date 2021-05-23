package com.local.study.stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class StringStudyTests {

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

	@DisplayName("스트림 예제1")
	@Test
	public void test1() {
		
		Optional<List> op = Optional.of(Arrays.asList("3", "5"));

		System.out.println(op.ofNullable("ㅋㅋㅋㅋ")); //인수가 널이 아니면 치환해서 씀
		System.out.println(op.of("zzzz")); //옵셔널이 가진 값이 널이냐에 따라 
		System.out.println(op.get());
		
//		int length = op.ofNullable("함수형").map(String::length).orElse(0);
//		System.out.println(length);
		
		
	}
	
}
