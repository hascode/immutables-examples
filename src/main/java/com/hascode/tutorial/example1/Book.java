package com.hascode.tutorial.example1;

import java.util.List;
import java.util.Optional;

import org.immutables.value.Value;

@Value.Immutable
public interface Book {
	String title();

	Optional<String> excerpt();

	Float price();

	List<String> tags();

}
