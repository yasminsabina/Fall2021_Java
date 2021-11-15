package class4;



public class Homework3 {
    public static void main(String[] args) {



        /**
         * Store 100 in result 1 if the length of sentence1 is greater than or equal to 10
         * else store 150 in result.
         * use Ternary Operator
         *
         */
        String sentence1 = "Hello dear, how are you doing?";
        int sentence1_Length = sentence1.length();
        int result1 = sentence1_Length > 10? 100:150;

        System.out.println("result1 =" + result1 );


        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WELL";

        /**
         * replace all instances of a/A with z
         */
        String replaceThis ="a";
        String sentence2Lowercase = sentence2.toLowerCase();
        String replaceThisLowercase = replaceThis.toLowerCase();
        String sentence2Replace = sentence2Lowercase.replace(replaceThisLowercase, "z") ;
        System.out.println(sentence2Replace);


        String sentence2Replace_a_z = sentence2.replace("a", "z");

        System.out.println("Original Sentence3 -->" + sentence2);
        System.out.println("After replace with z-->" + sentence2Replace_a_z);



        String sentence3 = "Health was Earlier said to Be the Ability of the body functioning WELL";

        /**
         * 1. the length of the sentence3-value.
         * 2. result if the sentence3 starts with "health" (ignoring cases)
         * result if the sentence3 contains "Body" (ignoring cases)
         * index of "Body" in sentence3
         */

        boolean isContains_health = sentence3.contains("health");
        System.out.println("\n Is" + sentence3 + "Contains health ? :" + isContains_health);


        String CheckFor = "health";
        String sentence3_Lowercase = sentence3.toLowerCase();
        CheckFor = CheckFor.toLowerCase();
        boolean isContains_Health = sentence3_Lowercase.contains("health");
        System.out.println("\nDoes" + sentence3 + "contains ? Health contains in" +CheckFor + "(ignoring cases) ? :" +isContains_Health);

        String Check_for = "Body";
        String sentence_Uppercase = sentence3.toUpperCase();
        Check_for = Check_for.toUpperCase();
        boolean isContains_Body = sentence_Uppercase.contains("Body");
        System.out.println("\n Is" + sentence3+ "contains? Body contains in" +Check_for + "(ignoring cases) ? :" + isContains_Body);

        int sentence3_length = sentence3.length();
        System.out.println("Sentence3 length =" + sentence3_length);

        int[] values = {89, 87, 67, 45, 32, 12, 56};
        String[] names = {"Denver", "happy", "king", "kong", "justice", "learn", "living", "peaceful", "play ground"};

        /*
            if a name have length more than 4
                print the name
                if the index is valid for values-array
                    print the value at same index from values-array
         */
        /**
         * print the names which contain a
         */








    }
}
