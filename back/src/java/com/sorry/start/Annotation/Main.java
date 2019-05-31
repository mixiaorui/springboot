package com.sorry.start.Annotation;

public class Main {

    public static void main(String[] args) {
        User user = new User();

        StringBuilder sb = new StringBuilder();
        Class u = user.getClass();
        boolean exist = u.isAnnotationPresent(TableName.class);

        if (!exist) {
            System.out.println("不是TableName注解类！");
        }

        TableName tableName = (TableName) u.getAnnotation(TableName.class);
        String tableN = tableName.value();

        System.out.println("表名为" + tableN);
    }
}
