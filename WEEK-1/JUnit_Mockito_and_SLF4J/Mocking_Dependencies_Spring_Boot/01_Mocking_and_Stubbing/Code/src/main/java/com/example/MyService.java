package com.example;

/**
 * Mockito Exercise 1: Mocking and Stubbing
 *
 * MyService depends on ExternalApi.
 * The dependency is injected via the constructor (constructor injection).
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
