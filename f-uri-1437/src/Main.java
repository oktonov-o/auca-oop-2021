import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char[] dir = new char[4];
        dir[0] = 'N';
        dir[1] = 'L';
        dir[2] = 'S';
        dir[3] = 'O';

        int n = inp.nextInt();
        String s;
        while (n != 0){
            int direction = 0;
            s = inp.next();
            for (int i=0; i<n; i++){
                if (s.charAt(i) == 'D'){
                    direction = (++direction)%4;
                } else if (s.charAt(i) == 'E'){
                    --direction;
                    if (direction == -1){
                        direction = 3;
                    }
                }
            }
            System.out.println(dir[direction]);
            n = inp.nextInt();
        }
    }
}
