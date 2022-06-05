package ch.poc.angular.heroes.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.poc.angular.heroes.model.Hero;

@RestController
@RequestMapping("/heroes")
public class HeroesController {

	@GetMapping("/all")
	public List<Hero> all() {

		List<Hero> resultHeros = Arrays.asList(ALL_HEROES);

		System.out.println("returning Heroes..." + LocalDateTime.now());

		return resultHeros;
	}

	@GetMapping("/{heroId}")
	public Hero get(@PathVariable long heroId) {
		for (Hero hero : ALL_HEROES) {
			if (hero.getId() == heroId) {
				return hero;
			}
		}

		return null;
	}

	private Hero[] ALL_HEROES = new Hero[] { new Hero(1, "Ioannis"), new Hero(2, "Iron-man"), new Hero(3, "Bat-man"),
			new Hero(4, "Spinter-man"), new Hero(5, "Hulk"), new Hero(6, "Captain America"), new Hero(7, "Thor"),
			new Hero(8, "Black widow"), new Hero(9, "Black Panther"), new Hero(10, "Doctor strange"),
			new Hero(11, "Ant-man"), new Hero(12, "John"), new Hero(13, "Giannis") };

}
