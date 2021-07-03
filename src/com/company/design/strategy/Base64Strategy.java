package com.company.design.strategy;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Strategy implements EncodingStrategy {//1. 전략 메서드를 가진 전략 객체
    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
