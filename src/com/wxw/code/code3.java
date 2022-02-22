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
//
//
//
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

/*
题目特点：数组长度为 n ，元素范围为 `0 ~ n-1` 理想情况就是一个萝卜一个坑。
解析思路：理想情况就是第 k 个位置存的值是 k，一直重复交换 arr[k], arr[arr[k]] 时进行判断。
🤔 外面一层遍历，内部判断逻辑需要用 while 循环，一直循环将交换的值 arr[i] 存储到 i 位置
[3, 2, 1, 3]
有两种情况：
1. 重复：循环第 i 位，该位置 arr[i] != i 那么，将 arr[i] 与 arr[arr[i]] 交换值，如果 arr[arr[i]] == arr[i]
2. 不重复：循环第 i 位，该位置 arr[i] != i 那么，将 arr[i] 与 arr[arr[i]] 交互值，如果 arr[arr[i]] != arr[i] 正常交换
*/
}
