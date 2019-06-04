package com.wangfan.rest.resource;


import com.alibaba.fastjson.JSON;
import com.wangfan.rest.pojo.Product;

import javax.ws.rs.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/6/2 14:49
 */
@Path("/products")
public class ProductResource {

    @GET
    @Path("{id}")
    public String getProducts(@PathParam("id") int id) {

        return String.valueOf(id);
    }

    @GET
    @Path("{name}-{version}")
    public String getProductDetail(@PathParam("name") String name, @PathParam("version") String version) {

        return name + version;
    }

    @GET
    @Path("/param/{brand}")
    @Produces("application/json")
    public Product getProductParam(@PathParam("brand") String brand) {
        Product product = new Product();
        product.setBrand(brand);
        return product;
    }

    @GET
    @Path("/price")
    @Produces("application/json")
    public String getProductPrice(@QueryParam("price") String price) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("price", price);
        return JSON.toJSONString(hashMap);
    }
}

