package com.example.helloworld.resources.atmosphere;

/**
 * Created with IntelliJ IDEA.
 * User: coder
 * Date: 4/8/13
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Response {

    public String text;
    public String author;
    public long time;

    public Response(String author, String text) {
        this.author = author;
        this.text = text;
        this.time = new Date().getTime();
    }

    public Response() {
    }
}