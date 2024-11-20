package com.prosoft;

import org.springframework.stereotype.Service;

@Service
public class StringProcessorService {

    public String toUpperCase(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        return input.toUpperCase();
    }
}
