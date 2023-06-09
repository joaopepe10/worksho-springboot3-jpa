package com.joaopepe10.cursospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;
import java.util.zip.DataFormatException;

@SpringBootApplication
public class CursospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursospringApplication.class, args);
	}

}
