package com.wangfan.rest.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/6/4 9:07
 */
public class NotFoundException extends WebApplicationException {

    public NotFoundException(ErrorMessage errorMessage) {
        super(Response.status(Response.Status.NOT_FOUND).entity(errorMessage).type("application/json").build());
    }
}
