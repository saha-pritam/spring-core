package org.pritam.springcore;

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
@Component("modelC")
public class ModelC{
	@Value("10")
	private int x;
	@Value("20")
	private int y;
	@Value("30")
	private int z;
	
	public int add(int x, int y) {
		return x+y;
	}
}
