package com.jlr.hexagonalarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This class run the spring boot project
 * 
 * @author Jorge Leon
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.jlr.hexagonalarchitecture"})
public class HexagonalAchitectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(HexagonalAchitectureApplication.class, args);
    }
}
