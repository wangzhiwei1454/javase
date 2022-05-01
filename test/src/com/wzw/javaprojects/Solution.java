package com.wzw.javaprojects;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode());
        head.next = new ListNode(2,new ListNode());
        ListNode middle = head.next;
        middle.next = new ListNode(4);

        ListNode head2 = new ListNode(1,new ListNode());
        head2.next = new ListNode(3,new ListNode());
        ListNode middle2 = head2.next;
        middle2.next = new ListNode(4);

        ListNode node = mergeTwoLists(head, head2);
        System.out.println(node);
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 一开始设置一个虚拟节点，它的值为 -1，它的值可以设置为任何的数，因为我们根本不需要使用它的值
        ListNode dummy = new ListNode(-1);

        // 设置一个指针，指向虚拟节点
        ListNode pre = dummy;

        // 通过一个循环，不断的比较 l1 和 l2 中当前节点值的大小，直到 l1 或者 l2 遍历完毕为止
        while (l1 != null && l2 != null) {
            // 如果 l1 当前节点的值小于等于了 l2 当前节点的值
            if (l1.val <= l2.val) {
                // 让 pre 指向节点的 next 指针指向这个更小值的节点
                // 即指向 l1
                pre.next = l1;
                // 让 l1 向后移动
                l1 = l1.next;
            }else {
                // 让 pre 指向节点的 next 指针指向这个更小值的节点
                // 即指向 l2
                pre.next = l2;
                // 让 l2 向后移动
                l2 = l2.next;

            }
            // 让 pre 向后移动
            pre = pre.next;
        }

        // 跳出循环后，l1 或者 l2 中可能有剩余的节点没有被观察过
        // 直接把剩下的节点加入到 pre 的 next 指针位置

        // 如果 l1 中还有节点
        if ( l1 != null) {
            // 把 l1 中剩下的节点全部加入到 pre 的 next 指针位置
            pre.next = l1;
        }

        // 如果 l2 中还有节点
        if ( l2 != null) {
            // 把 l2 中剩下的节点全部加入到 pre 的 next 指针位置
            pre.next = l2;
        }

        // 最后返回虚拟节点的 next 指针
        return dummy.next;
    }
}