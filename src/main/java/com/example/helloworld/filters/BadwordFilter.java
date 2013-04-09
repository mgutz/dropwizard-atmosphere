package com.example.helloworld.filters;

import com.example.helloworld.resources.atmosphere.Message;
import com.example.helloworld.resources.atmosphere.Response;
import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.cpr.BroadcastFilter;
import org.atmosphere.cpr.HeaderConfig;
import org.atmosphere.cpr.PerRequestBroadcastFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * An example of a filter replacing bad words.
 */
public class BadWordFilter implements BroadcastFilter {
    @Override
    public BroadcastAction filter(Object originalMessage, Object message) {

        if (message instanceof Response) {
            Response m = (Response) message;
            m.text = m.text.replace(".NET", "***");
            return new BroadcastAction(m);
        } else {
            return new BroadcastAction(message);
        }
    }
}