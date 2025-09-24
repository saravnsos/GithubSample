package com.github.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class OracleConfig {

	
	
	
	@Bean
	public DataSource getDataSource() {
		return new HikariDataSource();
	}
}
