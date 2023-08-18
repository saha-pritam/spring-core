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
@Component("modelBean")
public class Model{
	@Value("100")
	private int x;
	@Value("200")
	private int y;
	@Value("#{list}")
	private List<Integer> list;
}
