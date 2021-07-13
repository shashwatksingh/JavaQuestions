/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaquestions;

import java.util.*;

/**
 *
 * @author HP
 */
public class TwoNumberSumTarget {

    public int[] bruteForce(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return result;
    }

    public int[] twoPass(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }

        return result;
    }

    public int[] onePass(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scr.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scr.nextInt();
        }
        System.out.println("Enter the target");
        int target = scr.nextInt();
        TwoNumberSumTarget obj = new TwoNumberSumTarget();
        for (int i : obj.bruteForce(arr, target)) {
            System.out.println(i);
        }
        for (int i : obj.twoPass(arr, target)) {
            System.out.println(i);
        }
        for (int i : obj.onePass(arr, target)) {
            System.out.println(i);
        }
    }
}
