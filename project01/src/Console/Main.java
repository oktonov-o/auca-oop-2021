package Console;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Game game = null;
        try {
            game = parseArgs(args);
        } catch (NumberFormatException e){
            System.out.println("Incorrect input values!!!");
            System.exit(1);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

        for (;;){
            String cmdLine = inp.nextLine().trim();
            if(cmdLine.equals("quit")){
                break;
            }

            ArrayList<String> cmdArgs = new ArrayList<>();
            Scanner cmdInp = new Scanner(cmdLine);
            String firstArg = cmdInp.next();
            switch (firstArg){
                case "left":
                    int row = cmdInp.nextInt();
                    int col = cmdInp.nextInt();
                    game.left(row, col);
                    break;
                case "right":
                    break;
            }
        }
        System.out.println("Bye");
    }
    static Game parseArgs(String[] args) {
        int height = 9;
        int width = 9;
        int mines = 10;

        if (args.length == 0) {
            return new Game(height, width, mines);
        } else if (args.length == 3){
            width = Integer.parseInt(args[0]);
            height = Integer.parseInt(args[1]);
            mines = Integer.parseInt(args[2]);

            return new Game(height, width, mines);
        }

        throw new RuntimeException("Incorrect number of command line arguments!!!");
    }
}
