public class Main {
    public static void main(String[] args) {
        // Առաջին մաս
        int a = 2;
        int b = 4;
        int c = (a*a) + (b*b);
        System.out.println("c = " + c);

        // երկրորդ մաս
        a = 1;
        // a - սեղանի փոքր հիմք
        b = 3;
        // b - սեղանի մեծ հիմք
        c = 6;
        // c - սեղանի բարձրություն
        int S = ((a + b)/2)*c;
        System.out.println("S = " + S);

        // Երրորդ մաս
        int num = 216;
        String number = String.valueOf(num);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            System.out.println(j);
        }



    }

}