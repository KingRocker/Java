public class Code {

static int number1 = 5;

    public static void main(String[] args) {

        Adder(6, 7);
        Adder(100, 6000);
        Adder(-60, 120);

        int max1 = getMax(5, 7);
        int max2 = getMax(12, 7);

        int trueMax = getMax(max1, max2);
        System.out.println(trueMax);

        String s1 = "Hello over there";
        Integer number1 = 3;
        show(s1);
        show(number1);

        String ss1 = "abc";
        String ss2 = "def";

        System.out.println(128 == 128);
        System.out.println(128 <= 128);
        System.out.println(128 > 128);
        System.out.println(250 < 100);

        System.out.println();

        ss1.compareToIgnoreCase(ss2);
        ss1.equalsIgnoreCase(ss2);





    }

    public static void show(Object a){

        System.out.println("Behold! i give you " + a);
        System.out.println("Change 'a' to upper case: " + Character.toUpperCase('a') );
    }


    public static void Adder(int a, int b) {

        int c = a + b;
        System.out.println(c);

        System.out.println(Code.number1);

    }
public static int getMax(int n1, int n2){

        int max;

        if(n1 > n2){
            max = n1;
        }else{
            max = n2;
        }

        return max;
}

}
