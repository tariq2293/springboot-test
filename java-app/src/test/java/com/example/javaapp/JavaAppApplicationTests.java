package com.example.javaapp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class JavaAppApplicationTests {

    
    @Test
    void contextLoads() {
        int a = 10;
        int b = 20;
    
        assertEquals(30, a+b);
    }

}
