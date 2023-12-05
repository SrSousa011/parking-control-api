package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.controllers.MarketplaceControlApplication;

@SpringBootApplication
@RestController
public class Marketplace {

	public static void main(String[] args) {
		SpringApplication.run(MarketplaceControlApplication.class, args);
	}

}
