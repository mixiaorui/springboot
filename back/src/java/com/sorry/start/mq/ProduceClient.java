package com.sorry.start.mq;

public class ProduceClient {

    public static void main(String[] args) throws Exception {
        MqClient client = new MqClient();
        client.produce("Hello World");
    }
}
