public class Main {
    public static void main(String[] args) {
        Rational a =  new Rational("1/2");
        Rational b =  new Rational("2/3");

        a = a.add(b);
        System.out.println(a.toString());
    }
}
