package org.pritam.springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Model{
	
	private List<Integer> list;
	private Set<Integer> set;
	private Map<Integer,String> map;
	private Properties properties;
	
	
}
