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
	@Value("#{new int[3] {10,20,30}}")
	private int integerArray[];
	@Value("#{new String[3] {'Pritam','Aditya','Gunjan'}}")
	private String stringArray[];
	@Value("#{new char[3] {'a','b','c'}}")
	private char characterArray[];
}
