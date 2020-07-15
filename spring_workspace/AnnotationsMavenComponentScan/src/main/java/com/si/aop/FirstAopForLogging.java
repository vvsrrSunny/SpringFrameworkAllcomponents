package com.si.aop;

import org.aopalliance.intercept.Joinpoint;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class FirstAopForLogging {
	
	Logger logger = Logger.getLogger(getClass());

	@Before("execution(String com.si.beans.MyBeanHere.toString())")
	public void beforeAdvice(Joinpoint jointpoint) {
		logger.info("This method started with log4j's statement in tostring");

	}

}
