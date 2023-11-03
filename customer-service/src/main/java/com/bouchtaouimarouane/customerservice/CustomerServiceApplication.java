package com.bouchtaouimarouane.customerservice;

import com.bouchtaouimarouane.customerservice.entities.Customer;
import com.bouchtaouimarouane.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(CustomerRepository customerRepository,
											   RepositoryRestConfiguration restConfiguration){
		return args -> {
			restConfiguration.exposeIdsFor(Customer.class);
			customerRepository.saveAll(
					List.of(
							Customer.builder().name("Marouane").email("marouane@gmail.com").build(),
							Customer.builder().name("Bouchtaoui").email("bouchtaoui@gmail.com").build(),
							Customer.builder().name("Maro").email("maro@gmail.com").build()
					)
			);
			customerRepository.findAll().forEach(c->{
				System.out.println(c);
			});
		};
	}

}
