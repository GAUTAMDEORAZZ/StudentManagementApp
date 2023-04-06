package com.masai;

import java.util.HashSet;
import java.util.Set;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<>();
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello");
		set.add(str1);
		set.add(str3);
		set.add(str2);
		System.out.println(set);
	}

}
