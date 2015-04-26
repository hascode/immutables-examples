package com.hascode.tutorial.example5;

import java.util.List;

import org.immutables.value.Value;

@Value.Immutable
public abstract class TagCloud {
	abstract List<String> tags();

	@Value.Lazy
	public int charsCollected() {
		System.out.println("charCollected() called");
		return tags().stream().reduce("", (n, p) -> n + p).length();
	};
}
