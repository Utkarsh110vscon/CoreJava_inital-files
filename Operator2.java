//increment and decrement operator are used in this program
public class Operator2 {
    public static void main(String args[])
    {
        int a=5;
        //6+6+8+7+7   ,a=6
        int b=(++a)+(a++)+(++a)+(--a)+(a--);
        System.out.println(b);
        System.out.println(a);
    }
}
