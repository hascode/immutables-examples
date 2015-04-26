package com.hascode.tutorial.example2;

import java.util.List;
import java.util.Optional;

import org.immutables.value.Value;

@Value.Immutable
public abstract class AbstractPerson {
	abstract String getName();

	abstract List<String> getHobbies();

	abstract Optional<Integer> getAge();
}
