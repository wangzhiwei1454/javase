package com.wzw.javaprojects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<User> list1 = new ArrayList<>();
        list1.add(new User(1,"zgang"));
        list1.add(new User(2,"li"));
        list1 = Arrays.asList(new User(1,"zhan"),new User(2,"li"));

        List<User> list2 = new ArrayList<>();
        list2.add(new User(3,"zhang"));
        list2.add(new User(4,"zhao"));

        list1.addAll(list2);
        System.out.println(list1);
    }
}
