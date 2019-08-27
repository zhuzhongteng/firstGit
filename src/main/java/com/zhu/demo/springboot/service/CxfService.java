package com.zhu.demo.springboot.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace="http://service.zhu.demo.springboot.com")
public interface CxfService {

    @WebMethod
    public String getUser();

    @WebMethod
    public String getUserName();

}
