package com.wangfan.rest.resource;

import com.wangfan.rest.exception.ErrorMessage;
import com.wangfan.rest.exception.NotFoundException;
import com.wangfan.rest.pojo.Customer;
import org.glassfish.jersey.internal.inject.Custom;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/6/2 14:49
 */
@Path("/customers")
public class CustomerResource {

    @GET
    @Path("{id}")
    public String getCustomer(@PathParam("id") int id) {

        return String.valueOf(id);
    }

    @GET
    @Path("/all")
    @Produces({"application/xml"})
    public Collection<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        if (1 != 2) {
            ErrorMessage message = new ErrorMessage("1001", "Customer not found!", "http://localhost:8080/lab3/error1001.jsp", Response.Status.NOT_FOUND);
            throw new NotFoundException(message);
        }
        return customers;
    }
}
