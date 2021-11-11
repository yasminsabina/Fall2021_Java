package class3;

public class JavaOperators_Arithmetic {
    public static void main(String[] args) {

        /**T(°C) = (T(°F) - 32) × 5/9
         * cT = (fT-32) × 5/9
         * cT = 12.7778
         */
        double fTemp = 55;
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println("Degree Celsius = " + cTemp );

        int inc = 6;
        inc++;
        System.out.println("Value of inc =" + inc);
        System.out.println("Value of inc ="  + ++inc);
        System.out.println("Value of inc =" + inc++);
        System.out.println("Value of inc =" + inc);
        int num1 =14;
        int num2 = num1;
        System.out.println("value of num3 = " + (num1 + ++num2));






    }

}
