package laba;

import java.util.Scanner;

public class Program {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int[][] x = new int[2001][2001];
        int n = in.nextInt();
        int move;
        int xPos=1001, yPos=1001;
        for(int i = 0; i < n; i++) {
            move = in.nextInt();
            if(x[xPos][yPos] == 1) {
                System.out.print(i);
                return;
            }
            else x[xPos][yPos]=1;
            if(move == 1) {
                xPos--;
                yPos++;
            }
            if(move == 2) {
                yPos++;
            }
            if(move == 3) {
                xPos++;
                yPos++;
            }
            if(move == 4) {
                xPos++;
            }
            if(move == 5) {
                xPos++;
                yPos--;
            }
            if(move == 6) {
                yPos--;
            }
            if(move == 7) {
                xPos--;
                yPos--;
            }
            if(move == 8) {
                xPos--;
            }
        }
        System.out.print("Ok" + "\n" + (Math.abs(xPos-1001)+Math.abs(yPos-1001)));
    }
}
