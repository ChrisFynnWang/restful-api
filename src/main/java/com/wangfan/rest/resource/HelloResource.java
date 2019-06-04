package com.wangfan.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/6/2 14:49
 */
@Path("hello")
public class HelloResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHello() {

        return "hello world";
    }
}
