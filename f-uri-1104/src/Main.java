import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int x;
        int bCards;
        int aCards;
        while (a!=0 && b !=0){
            int[] cardsA = new int[100001];
            int[] cardsB = new int[100001];
            bCards = 0;
            aCards = 0;

            for (int i = 0; i<a; i++){
                x = inp.nextInt();

                cardsA[x]++;
            }
            for (int i = 0; i<b; i++){
                x = inp.nextInt();

                cardsB[x]++;
            }

            for (int i=0; i<cardsA.length; i++){
                if (cardsA[i] != 0 && cardsB[i] == 0){
                    aCards++;
                } else if (cardsA[i] == 0 && cardsB[i] != 0){
                    bCards++;
                }
            }

            System.out.println(Math.min(aCards, bCards));
            a = inp.nextInt();
            b = inp.nextInt();
        }
    }
}
