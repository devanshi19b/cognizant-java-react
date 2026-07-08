package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Mockito Exercise 2: Verifying Interactions
 *
 * PDF Scenario:
 * You need to ensure that a method is called with specific arguments.
 *
 * PDF Steps:
 * 1. Create a mock object.
 * 2. Call the method with specific arguments.
 * 3. Verify the interaction.
 *
 * PDF Solution Code (exact):
 */
public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();
        verify(mockApi).getData();
    }
}
