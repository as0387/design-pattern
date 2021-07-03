package com.company.design.singleton;

public class SocketClient {
    private static SocketClient socketClient = null;

    private  SocketClient() {//1. 디폴트 생성자를 private로 막는다.

    }

    public static SocketClient getInstance() {//2. static 메서드를 이용해 getInstance를 만들고

        if(socketClient == null) {
            socketClient = new SocketClient();//3. 최초로 한번만 생성될 수 있게 한다.
        }
        return socketClient; // 4. 널이아니면 자신의 객체 전달하도록 한다.
    }

    public void connect() {
        System.out.println("connect");
    }
}
