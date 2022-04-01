package com.wzw.javaprojects;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) {
        List<User> list1 = new ArrayList<>();
        List<User> list2 = new ArrayList<>();
        User user1 = new User(1,"zhangsan");
        list1.add(user1);
        list2.add(list1.get(0));
        list1.get(0).setId(2);
        list1.get(0).setName("lisi");
        list2.add(list1.get(0));
        System.out.println(list2);
    }
}
