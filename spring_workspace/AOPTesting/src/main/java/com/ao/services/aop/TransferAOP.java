package com.ao.services.aop;

import org.springframework.stereotype.Component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Component
public class TransferAOP {

	@Before("execution(* com.ao.services.*.*(..))")
	public void beforeAdvice(JoinPoint jp) {

		System.out.println("Before advice");
		System.out.println("@Before method signature " + jp.getSignature());
	}
	@Before("execution(* com.ao.services.*.*(..))")
	public void beforeAdvice2(JoinPoint jp) {

		System.out.println("Before advice 2");
		System.out.println("@Before method signature " + jp.getSignature());
	}

	@After("execution(* com.ao.services.*.*(..))")
	public void afterAdvice(JoinPoint jp) {
		System.out.println("After advice");
		System.out.println("@After method signature " + jp.getSignature());
	}

	@AfterReturning("execution(* com.ao.services.*.*(..))")
	public void afterRetunning(JoinPoint jp) {
		System.out.println("After Returning advice");
		System.out.println("@AfterReturning method signature " + jp.getSignature());
	}

	@AfterThrowing("execution(* com.ao.services.*.*(..))")
	public void afterThrowing(JoinPoint jp) {
		System.out.println("After throwing advice");
		System.out.println("@AfterThrowing method signature " + jp.getSignature());
		//System.err.println(e);
	}

}
