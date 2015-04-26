package com.hascode.tutorial.example6;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Human {
	abstract String name();

	@Value.Check
	protected void validate() {
		if (name().length() < 3) {
			throw new IllegalArgumentException("name is too short");
		}
	}
}
