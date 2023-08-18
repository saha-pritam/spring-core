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
	@Value("#{true and false}")
	private boolean and;
	@Value("#{true or false}")
	private boolean or;
	@Value("#{not false}")
	private boolean not;
}
