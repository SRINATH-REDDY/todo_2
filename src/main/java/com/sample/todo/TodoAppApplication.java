package com.sample.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreRepositories;

@EnableDatastoreRepositories
@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
//@EnableJpaRespositories(basePackages="com.sample.todo")
public class TodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

}
