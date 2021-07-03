package com.company.design;

import com.company.design.AOP.AopBrowser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class AOPMain {

    public static void main(String[] args) {
        /*Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();*/

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("loading time: " +end.get());

        aopBrowser.show();
        System.out.println("loading time: " +end.get());
    }
}
