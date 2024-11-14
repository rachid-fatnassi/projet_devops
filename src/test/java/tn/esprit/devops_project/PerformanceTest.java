package tn.esprit.devops_project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerformanceTest {

    @Test
    public void testPerformance() {
        long startTime = System.currentTimeMillis();
        
        // Run the code you want to test for performance
        for (int i = 0; i < 1000; i++) {
            // Some intensive task here
        }
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Duration: " + duration + " ms");

        // Assert that the duration is below a certain threshold
        assertTrue(duration < 500, "The operation should complete within 500 ms");
    }
}

