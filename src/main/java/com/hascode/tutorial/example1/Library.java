package com.hascode.tutorial.example1;

import java.util.List;

import org.immutables.value.Value;

@Value.Immutable
public interface Library {
	String name();

	List<Book> books();

	boolean opened();
}
