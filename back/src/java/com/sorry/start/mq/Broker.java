package com.sorry.start.mq;

import java.util.concurrent.ArrayBlockingQueue;

public class Broker {
    //队列存储消息最大数量
    private final static int MAX_SIZE = 3;

    //保存消息的容器
    private static ArrayBlockingQueue<String> messageQueue = new ArrayBlockingQueue<>(MAX_SIZE);

    public static void produce(String msg) {
        if (messageQueue.offer(msg)) {
            System.out.println("成功向消息处理中心投递消息！为：" + msg + ",当前暂存的消息数量是" + messageQueue.size());
        }else {
            System.out.println("消息中心消息数已达到最大负荷！");
        }
    }

    public static String consume() {
        String msg = messageQueue.poll();

        if (msg!=null) {
            System.out.println("被消费消息为：" + msg + ",当前消息数为：" + messageQueue.size());
        }else {
            System.out.println("消息处理中心没有消息可供消费！");
        }
        return msg;
    }
}
