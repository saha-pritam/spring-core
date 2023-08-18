package org.pritam.springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class ModelB{
	@Value("#{list}")
	private List<Integer> list;
	@Value("#{set}")
	private Set<Integer> set;
	@Value("#{map}")
	private Map<Integer,String> map;
	@Value("#{properties}")
	private Properties properties;
}
