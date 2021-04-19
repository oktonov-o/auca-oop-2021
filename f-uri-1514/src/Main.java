import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int m = inp.nextInt();
        int x;

        while (n != 0 && m != 0){
            int res = 0;
            int[] everyoneSolved = new int[m];
            boolean someoneSolvedAllTheProblems = false;
            boolean everyProblemWasSolved = true;
            boolean problemSolvedByEveryone = false;
            boolean everyoneSolvedAtLeastOneProblem = true;


            for (int i=0; i<n; i++){
                int solvedProblems = 0;
                for (int j=0; j<m; j++){
                    x = inp.nextInt();
                    if (x == 1){
                        solvedProblems++;
                        everyoneSolved[j]++;
                    }
                }
                if (solvedProblems == m){
                    someoneSolvedAllTheProblems = true;
                }
                if (solvedProblems == 0){
                    everyoneSolvedAtLeastOneProblem = false;
                }
            }
            for(int j=0; j<m; j++){
                if (everyoneSolved[j] == 0){
                    everyProblemWasSolved = false;
                }
                if (everyoneSolved[j] == n){
                    problemSolvedByEveryone = true;
                }
            }

            if(!someoneSolvedAllTheProblems){
                ++res;
            }
            if(everyProblemWasSolved) {
                ++res;
            }
            if(!problemSolvedByEveryone) {
                ++res;
            }
            if(everyoneSolvedAtLeastOneProblem) {
                ++res;
            }

            System.out.println(res);

            n = inp.nextInt();
            m = inp.nextInt();
        }
    }
}
