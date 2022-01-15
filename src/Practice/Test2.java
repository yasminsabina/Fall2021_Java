package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Test2 {
    /**
     * Ques-1:
     * Create a method to return a max value from an input-int-array
     * points: 10
     */
    /*
     *
     * eg:
     * input -> [32, 54, 12, 67, 2, 5]
     * returned value -> 67
     *
     * input -> [5, 4, 3, 1, 2]
     * returned value -> 5
     *
     * input -> [90, 34, 12, 4]
     * returned value -> 90
     *
     * input -> [-15, -4, -12, -7]
     * returned value -> -4
     */
    public int find_max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /* public static void main(String[] args) {
        int[] input = {32, 54, 12, 67, 2, 5};
        Test2 test2 = new Test2();

        System.out.println(test2.find_max(input));
    } */

    /**
     * Ques-2:
     * Create a method to return factorial value of input-int-value
     * points: 20
     */
    /*
     *
     * eg:
     * input -> 5
     * returned value -> (5*4*3*2*1) = 120
     *
     * input -> 1
     * returned value -> (1) = 1
     *
     * input -> 3
     * returned value -> (3*2*1) = 6
     *
     * input -> 10
     * returned value -> (10*9*8*7*6*5*4*3*2*1) = 3628800
     */
    public int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;


        }
        return result;
    }

    /* public static void main(String[] args) {
        int number = 5;
        Test2 test2 = new Test2();
        System.out.println(test2.factorial(number));
    } /*

    /**
     * Ques-3:
     * Create a method to return the common Strings values in two input-String-arrays
     * points: 30
     * Note: two input-String-arrays can be of same size or different size
     */
    /*
     *
     * eg:
     * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
     * returned value -> [happy, peace]
     *
     * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
     * returned value -> [abcde, koli]
     *
     */

    public ArrayList<String> findCommonString(String[] arr1, String[] arr2){
        ArrayList<String> arrayList = new ArrayList<>();
        for ( String str1:  arr1) {
            for (String str2: arr2) {
                if (str1.toLowerCase().equals(str2.toLowerCase())){
                    arrayList.add(str1.toLowerCase());
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        String[] arr1 = {"happY", "king", "peace", "living standard"};
        String[] arr2 = {"king kong", "Happy", "PEACE"};
        Test2 test2 = new Test2();
        System.out.println(test2.findCommonString(arr1,arr2));

    }

    /**
     * Ques-4:
     * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
     * points: 40
     */
    /*
     *
     * eg:
     * 	input -> : {3, 5, 1, 4, 2, 7}
     * 	returned value : 6
     *
     * 	input -> {2, 5, -1, 0, 6}
     * 	returned value : 1
     *
     * 	input -> {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * 	returned value : 4
     *
     * 	input -> {-2, -5, -1, -10, -6}
     * 	returned value : 1
     *
     */
}


