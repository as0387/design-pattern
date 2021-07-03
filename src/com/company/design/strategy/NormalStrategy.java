package com.company.design.strategy;

//전략 패턴으로 불리며, 객체지향의 꽃이다.
//유사한 행위들을 캡슐화하여, 객체의 행위를 바꾸고 싶은 경우 직접 변경하는 것이 아닌 전략만 변경하여, 유연하게 확장하는 패턴
//SOLID중에서 개방폐쇄 원칙 (OCP)과 의존 역전 원칙 (DIP)를 따른다.

//전략 패턴에서는 반드시 3가지를 가지고 있어야함.
//1. 전략 메서드를 가진 전략 객체
//2. 전략 객체를 사용하는 컨텍스트
//3. 전략 객체를 생성해 컨텍스트에 주입하는 클라이언트

public class NormalStrategy implements EncodingStrategy{//1. 전략 메서드를 가진 전략 객체
    @Override
    public String encode(String text) {
        return text;
    }
}
