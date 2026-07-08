package com.example;

/**
 * Mockito Exercise 2: Verifying Interactions
 *
 * MyService depends on ExternalApi (injected via constructor).
 */
public class MyService {

    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}
