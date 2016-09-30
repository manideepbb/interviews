package com.elsevier.education;

import java.util.*;

/**

can run with gradlew clean build; java -cp build/classes/main com.elsevier.education.Exercise3

TODO We should be able to call people.add() twice but end with only one object in it.

Set cannot have duplicates. Hence, if we add the same object
twice, the we will end up with only one object.

The equality of objects is determined using hashCode() method.
When the HashSet tries to compare the two elements (in this case, the same p1 object added twice)
the hashCode() returns a different integer each time becuase of the Random number generator.

If we only return the id passed as contructor argument from hashCode(), 
if the same element added twice, hashCode() returns same value
*/
public class Exercise3 {

	public static void main(String[] args) {
	
		Set<Person> people = new HashSet<>();
	
		Person p1 = new Person(1);
		people.add(p1);
		people.add(p1);
		
		System.out.println(people.size()); // This prints 1 now
		
	}
	
	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		@Override
		public int hashCode() {
			return id; // Not using Random number
		}
		
		@Override
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
