package com.cloudwatt.bss.cumulus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cloudwatt.bss.cumulus.repositories.ReportJpaRepository;

@SpringBootApplication
public class CumulusApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CumulusApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(CumulusApplication.class, args);
		ReportJpaRepository repository = ctx.getBean(ReportJpaRepository.class);
		repository.findAll().forEach(report->System.out.println(report.getName()));
	}

}
