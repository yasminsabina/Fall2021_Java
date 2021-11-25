package class4;


import com.sun.codemodel.internal.JArray;

import java.util.Arrays;

public class Homework4 {
        public static void main(String[] args) {

            // Due Date: Nov 11

            /**
             * Q1:
             * Store a country name in a variable.
             * Print the name of country
             * Print the length of country name (NOTE: you CANNOT use length() from String class)
             * Hint: you need to use split() method and length (from Array)
             */
            String country = "Bangladesh";
            System.out.println("Country name = " + country);
            String[] afterSplit = country.split("");

            System.out.println("Length of country =" + afterSplit.length);






            /**
             * Q2:
             * Print the number of words in the sentence2-value
             */
            String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
            String[] sentence_AfterSplit = sentence2.split(" ");
            System.out.println(Arrays.toString(sentence_AfterSplit));
            System.out.println(" Sentence2 Value = " +sentence_AfterSplit.length);




            /**
             * Q3:
             * Create the abbreviation for 4-word sentence
             *
             * make America great again -> MAGA
             * outfit of the day -> OOTD
             * happy birthday to you -> HBTY
             *
             * hint: split, charAt, toUppercase
             *      split, subString, toUppercase
             *
             */
            String sentence3 = "Make America Great Again";


            String[] sentence3_AfterSplit= sentence3.split(" ");
            String result = "--";

            //result = ""+ sentence3_AfterSplit[0].charAt(0) + sentence3_AfterSplit[1].charAt(0) +sentence3_AfterSplit[2].charAt(0) + sentence3_AfterSplit[3].charAt(0) ;
        for (int i=0 ; i< sentence3_AfterSplit.length; i++) {
            String str = sentence3_AfterSplit[i];
             System.out.println(i + " " + sentence3_AfterSplit[i].charAt(0));
           // result += str.charAt(0);
          // System.out.println("result : " + result);
           }
            System.out.println(result);





        }
    }

