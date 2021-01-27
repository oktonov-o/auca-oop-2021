public class StringVsStringBuilder {
    static final int N = 100000;
    public static void main(String[] args) {
        StringBuilder();
        Stringer();
    }

    private static void Stringer() {
        long beg = System.currentTimeMillis();
        String res = "";
        for (int i=0; i<N; i++){
            res += "Hello".charAt(i%5);
        }
        long end = System.currentTimeMillis();

        System.out.println(res.length());
        System.out.println(end-beg);
    }
    private static void StringBuilder() {
        long beg = System.currentTimeMillis();
        StringBuilder res = new StringBuilder();
        for (int i=0; i<N; i++){
            res.append("Hello".charAt(i%5));
        }
        long end = System.currentTimeMillis();

        System.out.println(res.length());
        System.out.println(end-beg);
    }
}
