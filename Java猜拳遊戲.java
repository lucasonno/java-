// use switch
import java.util.Scanner;

public class Java猜拳遊戲 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fa="",fb="",result="";
        int a,b;
        a = in.nextInt(); //player's punch
        b = (int)Math.floor(Math.random()*3); //create 0~3 random
        System.out.println("Input 0 is paper, 1 is scissors, 2 is stone");
        switch (a){
            case 0:
                fa = "paper";
                switch (b){
                    case 0:
                        fb = "paper";
                        result = "Tie";
                        break;
                    case 1:
                        fb = "scissors";
                        result = "Computer win";
                        break;
                    case 2:
                        fb = "stone";
                        result = "You win";
                        break;
                }
                break;
            case 1:
                fa = "scissors";
                switch (b){
                    case 0:
                        fb = "paper";
                        result = "You win";
                        break;
                    case 1:
                        fb = "scissors";
                        result = "Tie";
                        break;
                    case 2:
                        fb = "stone";
                        result = "Computer win";
                        break;
                }
                break;
            case 2:
                fa = "stone";
                switch (b) {
                    case 0:
                        fb = "paper";
                        result = "Computer win";
                        break;
                    case 1:
                        fb = "scissors";
                        result = "You win";
                        break;
                    case 2:
                        fb = "stone";
                        result = "Tie";
                        break;
                }
                break;
        }
        System.out.println("Your punch is : " + fa);
        System.out.println("Computer's punch is : " + fb);
        System.out.println("This game's result is : " + result);
    }
}
