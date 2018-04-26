package com.paste.ws;

import org.glassfish.jersey.server.ResourceConfig;

public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("com.paste.ws");
    }
}
