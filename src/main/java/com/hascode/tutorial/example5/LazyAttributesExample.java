package com.hascode.tutorial.example5;

public class LazyAttributesExample {
	public static void main(final String[] args) {
		TagCloud cloud = ImmutableTagCloud.builder().addTags("foo", "bar", "baz", "bleh", "xoxo").build();
		System.out.println("chars collected: " + cloud.charsCollected());
		System.out.println("chars collected: " + cloud.charsCollected());
	}
}
