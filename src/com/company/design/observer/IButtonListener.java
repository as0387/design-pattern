package com.company.design.observer;


// 옵저버 패턴
//관찰자 패턴은 변화가 일어났을 때 미리 등록된 다른 클래스에 통보해주는 패턴을 구현한 것이다.
//많이 보이는 곳은 event listener에서 해당 패턴을 사용하고 있다.
public interface IButtonListener {
    void clickEvent(String event);
}