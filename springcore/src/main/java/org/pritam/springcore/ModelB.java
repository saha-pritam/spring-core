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
	@Value("#{new org.pritam.springcore.ModelC(100,200)}")
	private ModelC modelC;
}
