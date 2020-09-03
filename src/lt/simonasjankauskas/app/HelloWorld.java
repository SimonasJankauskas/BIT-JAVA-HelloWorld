package lt.simonasjankauskas.app;

public class HelloWorld {
    public static void main(String[] args) {
        // 0. Hw
        System.out.println("Hello World!");
        System.out.println("----------");
        // zodis "sout" yra System.out.println shortcut

        // 1. Kintamieji
        // ... Deklaracija
        int i;

        // Deklaracija + inicializacija
        int j = 5;
        int z = 5;

        // Unary operator
        j++; // j+=1 ;; j=j+1; <-- sitie ta pati ka j++ reiskia, prideda 1

        // Binary operator
        int result = z + j;
        System.out.println(result);

        // "+" overloaded operator
        System.out.println(5 + 6); // rezultatas 11
        System.out.println("5" + "6"); // rezultatas 56

        // cast'ing
        double d = 5.9;
        int di = (int)d;
        System.out.println(di); //skaicius po kablelio panaikinamas

        float f1 = 5.9f;
        double d1 = f1; // priskirti galima be cast'o

        double d2 = 5.9;
        float f2 = (float) d2; // reikia cast'inti, nes double yra didesnis

        // Strings
        String s1 = "\uD83E\uDDE0 \uD83E\uDDB7 \uD83E\uDDB4";
        System.out.println(s1);

        // ... equality
        String s2 = "ABC";
        String s3 = new String("ABC");
        System.out.println(s2 == s3); // netaisyklingas budas, false
        System.out.println(s2.equals(s3)); // naudoti sita metoda, equals, true

        // ... int equality
        int i1 = 10;
        int i2 = 10;
        System.out.println(i1 == i2); // true

        // ...
        System.out.println("-------");
        System.out.println("ABC".equalsIgnoreCase("abc"));
        System.out.println("ABC".endsWith("BC"));
        System.out.println("ABC".endsWith("bc"));
        System.out.println("ABC".toLowerCase());
        System.out.println("ABC".toLowerCase().endsWith("bc"));
        System.out.println("ABC".replace("A", "Z"));


    }
}
