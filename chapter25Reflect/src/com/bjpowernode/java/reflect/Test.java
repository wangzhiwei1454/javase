package com.bjpowernode.java.reflect;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;

public class Test {
    public static void main(String[] args) {
        ResourceBundle bundle  = ResourceBundle.getBundle("com/bjpowernode/java/bean/db");
        String className = bundle.getString("className2");
        try {
            Class userServiceClass = Class.forName(className);
            Object obj = userServiceClass.newInstance();
            Method method = userServiceClass.getDeclaredMethod("login",String.class,String.class);
            Object retValue = method.invoke(obj,"admin","123");
            System.out.println(retValue);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
