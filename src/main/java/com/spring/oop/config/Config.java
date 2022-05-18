package com.spring.oop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Spring Application 이 뜰 때, 어떤 설정이 있는지 살펴볼 것
// Spring 전용 Config
// 아래의 경로를 루트로 삼아 이 이하에 있는 빈들을 스캔하겠다는 의미
@ComponentScan("com.spring.oop")
@Configuration
public class Config {

}
