package org.pritam.springcore;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ModelA{
	private List<Integer> listInteger;
	private List<String> listString;
	private List<Character> listCharacter;
}
