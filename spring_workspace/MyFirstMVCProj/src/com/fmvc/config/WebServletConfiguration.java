package com.fmvc.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class WebServletConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //return new Class[] { WebMvcConfig.class };// this works as well. Here we config DAO,sevices congif
        return null;
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        //return null;
    	return new Class[] { WebMvcConfig.class };// We put config of controllers(mostly view resolvers).
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
        //return new String[] { "/sss/*" }; needs http://localhost:8080/MyFirstMVCProj/sss/anythingHere
    }
        
    
}