package com.hascode.tutorial.example3;

public class Example3 {

	public static void main(final String[] args) {
		Box box1 = ImmutableBox.builder().width(12).height(20).build(); // works

		// throws illegal-state exception, height has been already set!
		Box box2 = ImmutableBox.builder().width(12).height(20).height(21).build();
	}

}
