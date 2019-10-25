package day2;

public class kasusBaru {

    public static void main(String[] args) {
        String username = "xsismitrautama";

        String xsis = username.substring(0,4);
        System.out.println(xsis);

        int x = (int)(1000 + (Math.random() * (500-100)));
        System.out.println(x);

        System.out.println(xsis+x);
    }
}
