package com.si.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.si.beans.Adress;
import com.si.beans.MyBeanHere;

@Configuration
@ComponentScan("com.si.*")
public class AppConfig {

	
}
