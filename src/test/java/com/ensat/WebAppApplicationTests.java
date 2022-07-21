package com.ensat;

import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.junit.jupiter.*;
import org.springframework.test.context.web.*;

@ExtendWith(MockitoExtension.class)
@WebAppConfiguration
public class WebAppApplicationTests {

    @Test
    public void contextLoads() {
    }
}
