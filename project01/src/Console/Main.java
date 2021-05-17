package Console;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static String help = String.format("Help:\n" +
                                        "left <row> <col>\n" +
                                        "    - left click with the coordinates (row, col)\n" +
                                        "right <row> <col>\n" +
                                        "    - right click with the coordinates (row, col)\n" +
                                        "show\n" +
                                        "    - show all mines (cheating)\n" +
                                        "quit\n" +
                                        "    - quit the game (EOF works too)\n" +
                                        "help\n" +
                                        "    - this text\n");

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
            System.exit(2);
        }

        System.out.println(help);

        for (;;){
            System.out.println(game);

            String cmdLine = inp.nextLine().trim();

            if(cmdLine.equals("quit")){
                System.out.println("Game stopped");
                break;
            }

            ArrayList<String> cmdArgs = new ArrayList<>();
            Scanner cmdInp = new Scanner(cmdLine);
            String firstArg = cmdInp.next();
            int row, col;
            switch (firstArg){
                case "left":
                    row = cmdInp.nextInt();
                    col = cmdInp.nextInt();
                    game.left(row, col);
                    break;
                case "right":
                    row = cmdInp.nextInt();
                    col = cmdInp.nextInt();
                    game.right(row, col);
                    break;
                case "show":
                    game.show();
                    break;
                case "help":
                    System.out.println(help);
                    break;
            }
            if (game.lost){
                System.out.println("You lost the game");
                break;
            }
            if (game.won){
                System.out.println("Congrats!!! You WON!!!");
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
        } else if (args.length == 1){
            if (args[0].equals("expert")){
                width = 30;
                height = 16;
                mines = 99;
                return new Game(height, width, mines);
            } else if (args[0].equals("intermediate")){
                width = 16;
                height = 16;
                mines = 40;
                return new Game(height, width, mines);
            } else if (args[0].equals("beginner")){
                width = 9;
                height = 9;
                mines = 10;
                return new Game(height, width, mines);
            }
        }

        throw new RuntimeException("Incorrect number of command line arguments!!!");
    }
}
