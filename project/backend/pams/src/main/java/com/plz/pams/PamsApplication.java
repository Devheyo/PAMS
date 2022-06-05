package com.plz.pams;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.plz.pams.mapper"})
public class PamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PamsApplication.class, args);
	}

}
