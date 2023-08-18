package org.pritam.springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ModelA{
	private List<Integer> list;
	private Set<Integer> set;
	private Map<Integer,String> map;
	private Properties properties;
}
