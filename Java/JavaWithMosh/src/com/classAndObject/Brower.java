package com.classAndObject;

public class Brower {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = seedHttpRequest(ip);
        System.out.println(html);
    }

    private String seedHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}
