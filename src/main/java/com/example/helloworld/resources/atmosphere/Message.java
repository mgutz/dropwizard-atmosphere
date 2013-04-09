package com.example.helloworld.resources.atmosphere;

/**
 * Created with IntelliJ IDEA.
 * User: coder
 * Date: 4/8/13
 * Time: 11:27 PM
 * To change this template use File | Settings | File Templates.
 */
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
    public String author = "";
    public String message = "";

    public Message(){
    }

    public Message(String author, String message) {
        this.author = author;
        this.message = message;
    }
}