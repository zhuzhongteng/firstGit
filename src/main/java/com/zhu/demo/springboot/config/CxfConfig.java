package com.zhu.demo.springboot.config;

import com.zhu.demo.springboot.service.CxfService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
    @Autowired
    private Bus bus;
    @Autowired
    private CxfService cxfService;
   /* @SuppressWarnings("all")
     @Bean
     public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/soap/*");
    }*/

    @Bean
     public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, cxfService);
        endpoint.publish("/user");
        return endpoint;
    }


}
