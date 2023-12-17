package twoPointers;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] array){
        int pointer = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i]!=array[i-1]){
                array[pointer++] = array[i];
            }
        }
        return pointer;
    }





    public static void main(String[] args) {
        int [] numbers = new int []{1,1,2};
        int [] numbersSecond = new int []{0,0,1,1,1,2,2,3,3,4};
        System.out.println("result ="+ removeDuplicates(numbersSecond));
        System.out.println(Arrays.toString(numbersSecond));

        System.out.println("result ="+ removeDuplicates(numbers));

        System.out.println("TWO POINTERS");
    }
}
