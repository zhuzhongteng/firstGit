package com.zhu.demo.springboot.service;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(serviceName="CxfService",//对外发布的服务名
targetNamespace="http://service.zhu.demo.springboot.com",//指定你想要的名称空间，通常使用使用包名反转
        endpointInterface="com.zhu.demo.springboot.service.CxfService")
@Component
public class CxfServiceImpl implements CxfService{

    @Override
    public String getUser(){
        return "当你看到这句话，恭喜你WebServicefa成功了！！";
    }
    @Override
    public String getUserName(){
        return "当你看到这句话，恭喜你WebServicefa成功了！！";
    }
}
