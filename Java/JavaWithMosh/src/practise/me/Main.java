package practise.me;

import java.io.IOException;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        String host = "192.168.1.181";
        int timeOut = 3000; //超时应该在3钞以上
        boolean status = InetAddress.getByName(host).isReachable(timeOut);
        System.out.println(status);
    }
}
