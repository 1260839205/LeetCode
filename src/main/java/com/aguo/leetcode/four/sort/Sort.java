package com.aguo.leetcode.four.sort;

import org.junit.Test;

/**
 * @author Code Fruit
 * @date 2021/7/29 10:32
 * @Email 126089205@qq.com
 */
public class Sort {
    @Test
    public void test(){
        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6}, 3);
    }

    public void merge(int[] A, int m, int[] B, int n) {
        int i = m -1,s = 0;
        while(s < n){
            A[++i] = B[s++];
        }
        quickSort(A,0,A.length - 1);
    }

    public static int[] quickSort(int[] arr,int left, int right){

        if (left >= right){
            return arr;
        }

        //基准数
        int pivot = arr[left];
        int num = left, num2 =right;
        while(left < right){
            while(pivot <= arr[right] && left < right){
                right--;
            }
            while(pivot >= arr[left] && left < right){
                left++;
            }
            arr = sort(arr,left,right);
            //System.out.println("交换中：" + Arrays.toString(arr)+"下标left:"+left+",下标right:"+right);
        }
        arr = sort(arr,num,left);

        quickSort(arr,num,left - 1);
        quickSort(arr,left + 1,num2);
        return arr;
    }

    /**
     * 两数交换
     * @param arr
     * @param i
     * @param j
     * @return
     */
    private static int[] sort(int[] arr,int i, int j){
        if (i == j) {
            return arr;
        }
        //System.out.println("下标left:"+i+",下标right:"+j);
        int num;
        num = arr[i];
        arr[i] = arr[j];
        arr[j] = num;
        //System.out.println("交换中：" + Arrays.toString(arr)+"下标left:"+i+",下标right:"+j);
        return arr;
    }
}
