package com.lgy.demo12;

import java.util.*;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Integer a = 126;
//        System.out.println(a);
//        try {
//            int A = in.nextInt();
//            int B = in.nextInt();
//            System.out.println(A/B);
//        } catch (Exception e) {
//            throw new MultiException("输入错误");
//        }
        Vector v1 = new Vector();
        String s = "ABC";
        String h = "hello";
        String s1 = new String("ABC");

        System.out.println(s == s1);
        System.out.println(s == s1.intern());

        String hs = h + s;
        Set set = new HashSet();

        Map map = new HashMap();

        Solution solution = new Solution();
        String[] arr = {"2","7","9"};
//        int[] ints = solution.twoSum(arr, 9);
//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }
        List<String> list = new ArrayList<>();
        Collections.addAll(list, arr);
        for (String s2 : list) {
            System.out.println(s2);
        }
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));

    }
}

class MultiException extends RuntimeException {
    MultiException(String e) {
        super(e);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[]{};
        }

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
