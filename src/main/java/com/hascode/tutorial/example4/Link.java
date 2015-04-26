package com.hascode.tutorial.example4;

import org.immutables.value.Value;

@Value.Immutable
public interface Link {
	public enum Protocol {
		HTTP, HTTPS
	};

	@Value.Parameter
	String url();

	@Value.Parameter
	Protocol protocol();
}
