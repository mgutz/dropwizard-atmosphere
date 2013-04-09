package com.example.helloworld.resources.atmosphere;

import com.example.helloworld.resources.Message;
import com.example.helloworld.resources.Response;
import org.atmosphere.annotation.Broadcast;
import org.atmosphere.annotation.Suspend;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: coder
 * Date: 4/8/13
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/")
public class ChatResource {
    @Suspend(contentType = MediaType.APPLICATION_JSON)
    @GET
    public String suspend() {
        return "";
    }

    @Broadcast(writeEntity = false)
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response broadcast(Message message) {
        return new Response(message.author, message.message);
    }
}
