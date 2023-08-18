package org.pritam.springcore;

import java.util.List;

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
	@Value("#{{10,20,30}}")
	private List<Integer> listInteger;
	@Value("#{{'Pritam','Aditya','Gunjan'}}")
	private List<String> listString;
	@Value("#{{'a','b','c'}}")
	private List<Character> listCharacter;
}
