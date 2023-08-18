package org.pritam.springcore;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class ModelC{
	private int x;
	private int y;
	public ModelC(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
