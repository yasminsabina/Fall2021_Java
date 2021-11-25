package class4;

import java.util.Arrays;

public class CodeTest {
    /**
     * Ques-1:
     * Create a method to return an int-array after sorting an input-int-array
     * points: 10
     */
    /*
     *
     * eg:
     * input -> [32, 54, 12, 67, 2, 5]
     * returned array -> [2, 5, 12, 32, 54, 67]
     *
     * input -> [5, 4, 3, 1, 2]
     * returned array -> [1, 2, 3, 4, 5]
     *
     * input -> [90, 34, 12, 4]
     * returned array -> [4, 12, 34, 90]
     *
     *
     */
            public int[] sortArray(int[] array){
                Arrays.sort(array);
                return array;
            };

    public static void main(String[] args) {
        CodeTest test = new CodeTest();
        int[]  array = {5, 4, 3, 1, 2};

        System.out.println(Arrays.toString(array));
    }




    /**
     * Ques-2:
     * Create a method to return the sum of digits in input-int-value
     * points: 20
     */
    /*
     *
     * eg:
     * input -> 123
     * returned value -> 6
     *
     * input -> 323
     * returned array -> 8
     *
     * input -> 90
     * returned array -> 9
     *
     */



    /**
     * Ques-3:
     * Create a method to print the common Strings values in two input-String-arrays
     * points: 30
     * Note: two input-String-arrays can be of same size or different size
     */
    /*
     *
     * eg:
     * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
     * Method should print ->
     * happy
     * peace
     *
     * input -> {"ab", "abcd", "abc", "abcde", "defg", "koli"} , {"abcde", "jhuy", "plot", "koli"}
     * Method should print ->
     * abcde
     * koli
     *
     */


    /**
     * Ques-4:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
     * points: 40
     */
    /*
     *
     * eg:
     * input -> 23, {23, 54, 67, 12, 34, 23, 56}
     * returned array -> {54, 67, 12, 34, 56}
     *
     * input -> 5, {23, 5, 67, 87, 10, 5, 34, 98, 66}
     * returned array -> {23, 67, 87, 10, 34, 98, 66}
     *
     * input -> 11, {22, 33, 44, 55}
     * returned array -> {22, 33, 44, 55}
     *
     */
    public int[] removingArray(int num , int[] inputArray){
        int count = 0;
        for (int i=0; i<inputArray.length; i++){


            if (inputArray[i]==num){
                count++ ;
            }

        }
        int [] newArray = new int[inputArray.length - count];

        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != num){
                newArray[j] = inputArray[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));

        return new int[1];

    }

    public static void main(String[] args) {
        CodeTest input = new CodeTest();
        int[] intarray = {23, 54, 67, 12, 34, 23, 56};
        input.removingArray(23,intarray);


    }



}
