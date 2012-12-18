package org.opensourcesoftwareandme;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class HelloWorldImpl {

    public String sayHi(@WebParam(name = "text") String text) {
        return "Hello " + text;
    }
}
