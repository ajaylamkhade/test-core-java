package javarunner.core.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestArraySort {

    public static void main(String[] args) {
        int numberArray1 [] = {7,8,5,1,0,10,5,1};
        int numberArray2 [] = {9,2,11};
        int resultArray [] = new int[numberArray1.length+numberArray2.length];
        String strArray [] ={"a" ,"b","c"};


        //sorting using java8
        IntStream intStream =Arrays.stream(mergeTwoArrays(numberArray1,numberArray2,resultArray));
        //intStream.sorted().forEach(n-> System.out.print(n +"  "));
        //System.out.println("\n");
        //reverse order
        List<Integer>  reversedOrderList = intStream.boxed().sorted(Comparator.comparingInt((Integer i) -> Integer.valueOf(i)).reversed()).collect(Collectors.toList());
        System.out.println("reversed order list :" +reversedOrderList);



       // System.out.println("Sorted Array :" + Arrays.toString(sortArraysInAscendingOrder(numberArray1)));
        System.out.println("Merged Array :" + Arrays.toString(mergeTwoArrays(numberArray1,numberArray2,resultArray)));
        //sorted merged array
        System.out.println("Sorted Merged Array :" + Arrays.toString(sortArraysInAscendingOrder(mergeTwoArrays(numberArray1,numberArray2,resultArray))));

    }

    private static int [] sortArraysInAscendingOrder( int numberArray[]){
        int temp;
        boolean sortedFlag=true;
        while (sortedFlag) {
            sortedFlag=false;
            for (int i = 0; i < numberArray.length - 1; i++) {
                if (numberArray[i] > numberArray[i + 1]) {
                    temp = numberArray[i];
                    numberArray[i] = numberArray[i + 1];
                    numberArray[i + 1] = temp;
                    sortedFlag=true;
                }
            }
        }
        return numberArray;
    }

    private static int [] mergeTwoArrays(int array1 [],int array2 [],int resultArray [] ){

        for(int i=0,j=0 ;i <resultArray.length;i++,j++){
            if(i < array1.length)
            resultArray[i]= array1[i];
            if(j < array2.length)
            resultArray[array1.length +j]=array2[j];

        }
        return resultArray;

    }


}
