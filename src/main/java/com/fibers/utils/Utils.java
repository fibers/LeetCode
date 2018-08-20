package com.fibers.utils;

import com.fibers.algorithm.datastructure.ListNode;

import java.util.List;

public class Utils {

    public static void reverseArray(int[] nums, int start, int end) {
        if (nums == null || nums.length <= 1 || start < 0 || end > nums.length - 1) {
            return;
        }

        for (; start < end; start++, end--) {
            if (nums[start] != nums[end]) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }
    }

    public static void swap(int[] a, int idx1, int idx2) {
        if (idx1 != idx2) {
            int temp = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = temp;
        }
    }

    public static void swap(ListNode a, ListNode b) {
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }

    public static void swap(List<Integer> list, int idx1, int idx2) {
        if (idx1 != idx2) {
            Integer temp = list.get(idx1);
            list.set(idx1, list.get(idx2));
            list.set(idx2, temp);
        }
    }

    public static void printList(List<Integer> l) {
        if (l != null) {
            int len = l.size();
            for (int i = 0; i < len; i++) {
                System.out.print(l.get(i));
                if (i < len - 1) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

    public static void printArray(int[] a) {
        if (a != null) {
            int len = a.length;
            for (int i = 0; i < len; i++) {
                System.out.print(a[i]);
                if (i < len - 1) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

    public static void printListNode(ListNode a) {

        while (a != null) {
            System.out.print(a.val);
            a = a.next;
            if (a != null) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

}