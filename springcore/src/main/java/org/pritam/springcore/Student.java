package org.pritam.springcore;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private Address address;

}
