package com.yxl.datastructure.SinglyLinkedList;

/**
 * LeetCode 2
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * <p>
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * <p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 */
public class TwoSumLinked {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static   ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        while (true) {
            if (l1.next==null&&l2.next==null){
                break;
            }
            int val1 = l1.val;
            int val2 = l2.val;
            l1 = l1.next;
            l2 = l2.next;
            System.out.println(val1+"_"+val2);
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(2);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(6);
        ListNode listNode5 = new ListNode(4);
        ListNode list = new ListNode();
        ListNode list1 = new ListNode();
        add(listNode0,list);
        add(listNode1,list);
        add(listNode2,list);
        add(listNode3,list1);
        add(listNode4,list1);
        add(listNode5,list1);
        addTwoNumbers(list,list1);
    }
    public static void add(ListNode heroNode,ListNode listNode) {

        //因为head节点不能动，因此我们需要一个辅助遍历 temp
        ListNode temp = listNode;
        //遍历链表，找到最后
        while(true) {
            //找到链表的最后
            if(temp.next == null) {//
                break;
            }
            //如果没有找到最后, 将将temp后移
            temp = temp.next;
        }
        //当退出while循环时，temp就指向了链表的最后
        //将最后这个节点的next 指向 新的节点
        temp.next = heroNode;
    }
}
