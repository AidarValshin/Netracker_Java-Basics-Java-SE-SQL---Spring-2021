package week_3.task003;

import static week_3.task003.Address.*;

public class Test {
    public static void main(String[] args) {
        String s1 = "    РФ  , Ульяновская область    , Старая Кулатка,   Северная, 40, 1 , 2";
        String s2 = "    РФ  ;  Ульяновская область    . Старая Кулатка-   Северная, 40. 1, 2";
        String s3 = "    РФ  - Ульяновская область-   Старая Кулатка   -Северная, 40, 1 -2 - Мусоооор";
        String s4 = "    РФ  . Ульяновская область. Старая Кулатка        -   Северная, 40, 1. 2  - ntcn";
        System.out.println("1->" +adsressFactoryComma(s1));
        System.out.println("2->" +adsressFactory(s1));
        System.out.println("3->" +adsressFactory(s2));
        System.out.println("4->" +adsressFactory(s3));
        System.out.println("5->" +adsressFactory(s4));
    }
}
