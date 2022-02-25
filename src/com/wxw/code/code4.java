package com.wxw.code;


/*
* 描述
* 在一个二维数组array中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
* 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
[
[1,2,8,9],
[2,4,9,12],
[4,7,10,13],
[6,8,11,15]
]
给定 target = 7，返回 true。

给定 target = 3，返回 false。

数据范围：矩阵的长宽满足 0 \le n,m \le 5000≤n,m≤500 ， 矩阵中的值满足 0 \le val \le 10^90≤val≤10
9

进阶：空间复杂度 O(1)O(1) ，时间复杂度 O(n+m)O(n+m)
* */
public class code4 {
    public static void main(String[] args) {
//        int target = 3; //3_false
        int target = 7; //7_true
        int[][] arr = new int[][]{
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };

        boolean result = Find(target, arr);

        System.out.println(target+"_"+result);
    }

    public static boolean Find(int target, int[][] matrix) {
        //无效二维数组直接返回false
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0, c = cols - 1; // 从右上角开始
        while (r <= rows - 1 && c >= 0) {
            //相等返回
            if (target == matrix[r][c])
                return true;
            //大于则向下一行查找
            else if (target > matrix[r][c])
                r++;
            //小于则向左一列查找
            else
                c--;
        }
        return false;
    }


    /**
     * 解题思路：
     * 该二维数组中的一个数，小于它的数一定在其左边，大于它的数一定在其下边。因此，从右上角开始查找，就可以根
     * 据 target 和当前元素的大小关系来缩小查找区间，当前元素的查找区间为左下角的所有元素。
     */
}
