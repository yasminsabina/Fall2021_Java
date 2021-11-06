package class3;

import javax.xml.bind.SchemaOutputResolver;

public class Homework1 {
    /**
     * F -> C
     * F -> K
     * C -> F
     * C -> K
     * K -> C
     * K -> F
     *
     */
    public static void main(String[] args) {

        double fTemp = 55;
        double cTemp = (fTemp - 32) * 5/9;
        double kTemp = (fTemp + 459.67)* 5/9;
        fTemp = (cTemp * 9 / 5 + 32);
        kTemp = (cTemp + 273.15);
        cTemp = (kTemp -273.15);
        fTemp = (kTemp * 9/5 - 459.67);



        System.out.println(fTemp + "°F is equal to " + cTemp + "°C");
        System.out.println(fTemp + "°F is equal to " + kTemp + "K");
        System.out.println(cTemp + "°C is equal to"  +  fTemp + "°F");
        System.out.println(cTemp + "°C is equal to"  +  kTemp + "K" );
        System.out.println(kTemp + "K is equal to"   +  cTemp + "°C");
        System.out.println(kTemp + "K is equal to"   +  fTemp + "°F");





    }

}
