package com.hascode.tutorial.example3;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(strictBuilder = true)
public interface Box {
	double width();

	double height();
}
