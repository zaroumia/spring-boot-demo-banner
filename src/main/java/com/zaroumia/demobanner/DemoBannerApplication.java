package com.zaroumia.demobanner;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemoBannerApplication {

	public static void main(final String[] args) {
		SpringApplication app = new SpringApplication(DemoBannerApplication.class);
		app.setBanner(new Banner() {

			@Override
			public void printBanner(final Environment environment, final Class<?> sourceClass, final PrintStream out) {
				out.println("ZAROUMIA IT");

			}
		});
		app.run(args);
	}

}
