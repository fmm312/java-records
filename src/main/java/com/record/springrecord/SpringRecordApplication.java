package com.record.springrecord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRecordApplication {

	public static void main(String[] args) {

		var person = new PersonClass("Ana", 15);
		System.out.println(person);

		var personRecord = new PersonRecord("José", 15);
		System.out.println(personRecord);
		personRecord.printName();
		PersonRecord.printMessage();
	}

}
