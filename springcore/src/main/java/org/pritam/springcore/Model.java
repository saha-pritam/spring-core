package org.pritam.springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Model {
	private List<String> friends;
	private Set<String> subjects;
	private Map<String,Integer> friendsAge;
	private Properties properties;

}
