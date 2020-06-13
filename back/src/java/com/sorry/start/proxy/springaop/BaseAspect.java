package com.sorry.start.proxy.springaop;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public abstract class BaseAspect implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;

        begin();
        try {
            if (isIntercept(method, args)) {
                before();
                result = methodProxy.invokeSuper(obj, args);
                after();
            } else {
                result = methodProxy.invokeSuper(obj,args);
            }
        } catch (Exception e) {
            error(e);
            throw e;
        } finally {
            end();
        }
        return result;
    }


    /**
     * 开始增强
     */
    public void begin() {
    }

    /**
     * 切入点判断
     */
    public boolean isIntercept(Method method, Object[] args) throws Throwable {
        return true;
    }

    /**
     * 前置增强
     */
    public void before() throws Throwable {
    }

    /**
     * 后置增强
     */
    public void after() throws Throwable {
    }

    /**
     * 异常增强
     */
    public void error(Throwable e) {
    }

    /**
     * 最终增强
     */
    public void end() {
    }


}
