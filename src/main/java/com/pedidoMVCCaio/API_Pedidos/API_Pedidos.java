package com.pedidoMVCCaio.API_Pedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.pedidoMVCCaio.API_Pedidos.model.entity")
@EnableJpaRepositories("com.pedidoMVCCaio.API_Pedidos.model.repository")
public class API_Pedidos {
	public static void main(String[] args) {
		SpringApplication.run(API_Pedidos.class, args);
	}
}
