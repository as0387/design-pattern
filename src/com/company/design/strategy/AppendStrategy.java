package com.company.design.strategy;

public class AppendStrategy implements EncodingStrategy{//1. 전략 메서드를 가진 전략 객체
    @Override
    public String encode(String text) {
        return "ABCD"+text;
    }
}
