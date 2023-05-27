package com.ms;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = { "address", "name", "emails", "kids","education","projects" })
public class Employee {
	private int eno;
	private String name;
	private Address address;
	private Set<String> emails;
	private Map<String, Integer> kids;
	private Properties education;// degree key,university/board value (btech davv, mtech iit, phd iist)
	private List<Project> projects;
	private Map<String,Address> addresses;
	
	
}
