package org.opensourcesoftwareandme;

import javax.xml.ws.Endpoint;

public class Server {

    public static void main(String args[]) throws Exception {
        Endpoint.publish("http://localhost:9000/helloWorld", new HelloWorldImpl());
        System.out.println("Server started...");
        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server stopping...");
        System.exit(0);
    }

}
