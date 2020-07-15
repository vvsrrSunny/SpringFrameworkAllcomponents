package com.ds.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("spring/application-config.xml")
@Configuration
@ComponentScan(basePackages = { "com.ds.beans", "com.ds.dao" })
public class ConnectionConfig {

}
