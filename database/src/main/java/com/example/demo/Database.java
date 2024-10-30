package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

////Database.java
//어노테이션 추가
@Configuration
@ConfigurationProperties(prefix = "database")
public class Database {
//변수 추가
private String ip;
private String port;
private String username;
private String password;

//마우스 우클릭 > [Source] > Generate Getters and Setters > [Select All] > [Generate]
//마우스 우클릭 > [Source] > Generate toString()... > [Generate]

//Ctrl + Shift + o 로 Library Import 

}
