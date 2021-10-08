public class ArithmetischeOperationen {

    public static void main(String[] args) {

        int a = 15;
        int b = 3;

        int add = a+b;
        int sub = a-b;
        int multi = a*b;
        int div = a/b;
        int mod = a&b;

        System.out.println(a+" + "+b+" = "+add);
        System.out.println(a+" - "+b+" = "+sub);
        System.out.println(a+" * "+b+" = "+multi);
        System.out.println(a+" / "+b+" = "+div);
        System.out.println(a+" % "+b+" = "+mod);
    }
}
