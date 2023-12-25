package com.kundan.spring.learnspringframework;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.kundan.spring.learnspringframework.game.GameRunner;
import com.kundan.spring.learnspringframework.game.GamingConsole;
import com.kundan.spring.learnspringframework.game.MarioGame;
import com.kundan.spring.learnspringframework.game.PacmanGame;

@SpringBootApplication
//@ComponentScan("com.kundan.spring.learnspringframework")
//@ComponentScan({"com.pack1","com.pack2"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		// MarioGame game = new MarioGame();
		// SuperContraGame game = new SuperContraGame();

		// GamingConsole game = new MarioGame(); //1
		// GameRunner runner = new GameRunner(game);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
