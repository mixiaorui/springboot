package com.sorry.start.huawei;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] pid = {1, 3, 10, 5};
        int[] ppid = {3, 0, 5, 3};
        int kill = 5;
        //输出容器
        List<Integer> result = new ArrayList<>();
        //添加本身节点
        result.add(kill);
        //添加子节点
        main.getChildren(kill, pid, ppid, result);
        //输出
        for (Integer i : result) {
            System.out.println(i);
        }
    }

    //递归获取子节点
    private void getChildren(int kill, int[] pid, int[] ppid, List<Integer> result) {
        if (isExist(ppid, kill)) {
            for (int i = 0; i < pid.length; i++) {
                if (ppid[i] == kill) {
                    result.add(pid[i]);
                    getChildren(pid[i], pid, ppid, result);
                }
            }
        }
    }

    //判断是否存在，默认不存在
    private static boolean isExist(int[] ppid, int kill) {
        for (int i = 0; i < ppid.length; i++) {
            if (ppid[i] == kill) {
                return true;
            }
        }
        return false;
    }

}
