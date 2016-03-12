package sn.esp.covoituragefrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"sn.esp","sn.esp.covoituragebackend"})
public class CovoiturageFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovoiturageFrontendApplication.class, args);
	}
}
