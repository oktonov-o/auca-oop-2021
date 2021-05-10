import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int tests = inp.nextInt();
        int commands, res, x;
        String s;
        for (int t = 0; t<tests; t++){
            res = 0;
            commands = inp.nextInt();
            String[] arrOfCommands = new String[commands];
            for (int c = 0; c<commands ; c++){
                s = inp.next();
                if (s.equals("LEFT")){
                    res--;
                    arrOfCommands[c] = "LEFT";
                } else if (s.equals("RIGHT")){
                    res++;
                    arrOfCommands[c] = "RIGHT";
                } else if (s.equals("SAME")){
                    s = inp.next();
                    if (s.equals("AS")){
                        x = inp.nextInt();
                        if (arrOfCommands[x-1].equals("LEFT")){
                            res--;
                            arrOfCommands[c] = "LEFT";
                        } else if (arrOfCommands[x-1].equals("RIGHT")){
                            res++;
                            arrOfCommands[c] = "RIGHT";
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }
}
