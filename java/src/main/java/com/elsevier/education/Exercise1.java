package com.elsevier.education;

/**

TODO: Make this class immutable.

Declared classes as final
Removed setters to prevent modification
Declared mutal fields as final
Initialized fields using constructor
*/
final public class Exercise1 {

	final public static class Person {
		
		private final Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person(Set<String> phoneNumbers,	String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
				
		public String getFirstName() {
			return firstName;
		}
				
		public String getLastName() {
			return lastName;
		}
		
	}
}
