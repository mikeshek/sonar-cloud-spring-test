package eu.mikesh.sonarcloudspringtest;

import eu.mikesh.sonarcloudspringtest.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SonarCloudSpringTestApplicationTests {

    @Autowired
    private TestController testController;

    @Test
    void contextLoads() {
        assertNotNull(testController);
    }

}
