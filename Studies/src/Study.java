public class Study {

    public static void main(String[] args) {
        System.out.println("!@#$");

        System.out.println();

        System.out.println("1");
        System.out.println("22");
        System.out.println("333");


        boolean gameOver = true;
        int score = 100;
        int highScore = 50;


        String name = "Warren";
        String name1 = "Paul";

        if (gameOver && score >= highScore) {


            System.out.println("Thank you, " + name + ", ");
            System.out.println("your highscore has been saved!");

        } else {
            System.out.println(name + " You suck!");
        }

        String s1 = "Hello";
        String s2 = s1 + "there!";

        int n = s1.length();
        System.out.println(n);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print("#");
        }
        System.out.println();



        String s3 = "Apples are the best fruit";
        int place = s3.indexOf("the");
        System.out.println(place);

        char letter = s3.charAt(4);
        System.out.println(letter);

        System.out.println("Hello \n\t\"Warren\"");

        String name2 = "John";
        name2 = "Dave";
        System.out.println(name2);

        int x = 3;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);
        x++;
        System.out.println(x);

        int y = 4, q = 5, z = 10;
        int total = z / (y * q);
        System.out.println(total);

        double up = 4.4;
        float yu = 2.2f;

        System.out.println(yu + " " + up + " \n" +(yu * up));

        double toatl = yu + up;
        toatl++;
        System.out.println(toatl);

        double height = 4, radius = 10, volume;
        volume = 3.14 * radius * radius * height * 1/3;
        System.out.println(volume);

        String nu = "Whales";
        System.out.println(nu + " " + (nu = "banana"));
        System.out.println(nu);

String a = "apple";
String b = "banana";


int c = 20;
int d = 25;

char e = 'q';
char f = 't';


        System.out.println();

        if (a != b){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
        System.out.println();

        String answer = (a != b) ? a : b;
        System.out.println(answer);

        int result = (c != d) ? c : d;
        System.out.println(result);

        char out = (e != f) ? e : f;
        System.out.println(out);

        String op = (true) ? String.valueOf(e) : a;
        System.out.println(op);







}
}
