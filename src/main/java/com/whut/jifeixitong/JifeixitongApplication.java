package com.whut.jifeixitong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.whut.jifeixitong.mapper")
public class JifeixitongApplication {

	public static void main(String[] args) {
		SpringApplication.run(JifeixitongApplication.class, args);
	}

}
