package com.prosoft;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StringProcessorServiceTest {

    @Autowired
    private StringProcessorService stringProcessorService;

    @Test
    void whenInputIsValid_thenConvertToUpperCase() {
        String result = stringProcessorService.toUpperCase("hello");
        assertEquals("HELLO", result);
    }

    @Test
    void whenInputIsNull_thenReturnEmptyString() {
        String result = stringProcessorService.toUpperCase(null);
        assertEquals("", result);
    }

    @Test
    void whenInputIsEmpty_thenReturnEmptyString() {
        String result = stringProcessorService.toUpperCase("");
        assertEquals("", result);
    }
}
