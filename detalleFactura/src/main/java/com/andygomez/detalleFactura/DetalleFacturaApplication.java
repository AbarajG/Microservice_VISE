package com.andygomez.detalleFactura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DetalleFacturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetalleFacturaApplication.class, args);
	}

}
