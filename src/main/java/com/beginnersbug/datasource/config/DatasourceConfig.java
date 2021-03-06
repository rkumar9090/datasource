package com.beginnersbug.datasource.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DatasourceConfig {

	@ConfigurationProperties(prefix = "datasource.custom")
	@Bean
	@Primary
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

}
