package com.hascode.tutorial.example2;

public class BuilderForAbstractClassExample {

	public static void main(final String[] args) {
		AbstractPerson person = ImmutablePerson.builder().age(22).addHobbies("sports", "travelling").name("Ted").build();
		System.out.println(person.toString());
	}

}
