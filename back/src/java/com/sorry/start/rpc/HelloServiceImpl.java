package com.sorry.start.rpc;

public class HelloServiceImpl implements HelloService {

  @Override
  public String sayHello(String content) {
    return "hello," + content;
  }

  @Override
  public String sayBay(String content) {
    return "bay";
  }
}