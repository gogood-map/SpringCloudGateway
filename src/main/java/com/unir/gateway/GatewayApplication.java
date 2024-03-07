package com.unir.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

	public static void main(String[] args) {
		// Recupera o perfil de execução da variável de ambiente. Caso contrário, usa o perfil padrão.
		String profile = System.getenv("PROFILE");
		if (profile != null && !profile.isEmpty()) {
			System.setProperty("spring.profiles.active", profile);
		} else {
			System.setProperty("spring.profiles.active", "default");
		}
		SpringApplication.run(GatewayApplication.class, args);
	}
}
