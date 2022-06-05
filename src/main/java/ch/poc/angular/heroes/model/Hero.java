package ch.poc.angular.heroes.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hero {
	private long id;
	private String name;
}
