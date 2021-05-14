

public class Main {
    public static void main(String[] args) {
        try {
            Circle c = new Circle(-5);
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
