package com.wxw.code;
// 找出数组中重复的数字。
//
//
// 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
// 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
//
// 示例 1：
//
// 输入：
// [2, 3, 1, 0, 2, 5, 3]
// 输出：2 或 3
//
//对于这种数组元素在 [0, n-1] 范围内的问题，可以将值为 i 的元素调整到第 i 个位置上进行求解。
//以 (2, 3, 1, 0, 2, 5) 为例，遍历到位置 4 时，该位置上的数为 2，但是第 2 个位置上已经有一个 2 的值了，
// 因此可以知道 2 重复

// 限制：
//
// 2 <= n <= 100000
// Related Topics 数组 哈希表 排序 👍 711 👎 0

public class code3 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 0, 2, 5, 3};

        int result = findRepeatNumber(arr);

        System.out.println(result);

    }

    public static int findRepeatNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i){
                if (arr[i] == arr[arr[i]]) {
                    return arr[i];
                }
                swap(arr,arr[i],i);
            }
        }
        return -1;


    }

    public static void swap(int arr[], int m, int n){
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }


}
