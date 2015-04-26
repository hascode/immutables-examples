package com.hascode.tutorial.example1;

public class BuilderForInterfaceExample {

	public static void main(final String[] args) {
		Book book1 = ImmutableBook.builder().title("One first book").excerpt("Lorem ipsum dolor sit.").addTags("foo", "bar", "baz").price(12.5F).build();
		Book book2 = ImmutableBook.builder().title("Another book").addTags("xoxo", "trololol").price(20.2F).build();
		Library library = ImmutableLibrary.builder().name("My first library").opened(true).addBooks(book1, book2).build();
		System.out.println(library.toString());
	}
}
