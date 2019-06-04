package com.wangfan.rest.exception;

import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/6/4 9:05
 */
@XmlRootElement(name = "message")
public class ErrorMessage {

    @XmlElement
    private String code;
    @XmlElement
    private String description;
    @XmlElement
    private String link;
    @XmlElement
    private Response.Status status;

    public ErrorMessage(String code, String description, String link, Response.Status status) {
        this.code = code;
        this.description = description;
        this.link = link;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Response.Status getStatus() {
        return status;
    }

    public void setStatus(Response.Status status) {
        this.status = status;
    }
}
