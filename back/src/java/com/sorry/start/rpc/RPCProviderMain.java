package com.sorry.start.rpc;

public class RPCProviderMain {

  public static void main(String[] args) throws Exception {
    HelloService service = new HelloServiceImpl();
    ProviderReflect.provider(service, 8083);
  }
}