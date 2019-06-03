package com.sorry.start.mq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.System.out;

public class BrokerServer implements Runnable{

    public static int SERVICE_PORT = 9999;

    private final Socket socket;

    public BrokerServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while(true) {
                String str = in.readLine();
                if (str==null) {
                    continue;
                }

                out.println("接收到原始数据："+ str);

                if ("CONSUME".equals(str)) {
                    String message = Broker.consume();
                    out.println(message);
                    out.flush();
                }else {
                    Broker.produce(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(SERVICE_PORT);

        while (true) {
            BrokerServer brokerServer = new BrokerServer(socket.accept());
            new Thread(brokerServer).start();
        }
    }
}
