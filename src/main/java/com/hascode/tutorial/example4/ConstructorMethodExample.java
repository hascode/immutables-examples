package com.hascode.tutorial.example4;

import com.hascode.tutorial.example4.Link.Protocol;

public class ConstructorMethodExample {

	public static void main(final String[] args) {
		Link link1 = ImmutableLink.of("www.hascode.com", Protocol.HTTP);
		Link link2 = ImmutableLink.builder().url("www.hascode.com").protocol(Protocol.HTTP).build();
		System.out.println("link1 equals link2: " + link1.equals(link2));
	}
}
