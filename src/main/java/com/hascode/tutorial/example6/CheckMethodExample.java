package com.hascode.tutorial.example6;

public class CheckMethodExample {

	public static void main(final String[] args) {
		Human human1 = ImmutableHuman.builder().name("Ted").build();
		System.out.println(human1);

		// fails with iae
		Human human2 = ImmutableHuman.builder().name("Te").build();

	}

}
