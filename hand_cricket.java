import java.util.Scanner;

public class hand_cricket {
    public static void main(String[] args) {
        int user_hit;
        int computer_hit;
        int score = 0;

        for (int i = 0; i <= 5; i++) {
            computer_hit = (int) (Math.random() * (6 - 1 + 1) + 1);
            Scanner sca = new Scanner(System.in);
            System.out.print("Enter Your Hit: ");
            user_hit = sca.nextInt();
            System.out.println("Computer's Hit: " + computer_hit);
            System.out.println("**********");

            if (computer_hit == user_hit) {
                System.out.println("HOWZATTT!!!!!!");
                System.out.println("YOUR FINAL SCORE = " + score);
                System.out.println("**********");
                break;
            }

            else if (user_hit > 0 && user_hit <= 6) {
                score = score + user_hit;
            } else if (user_hit > 6) {
                System.out.println("You are Entering a wrong hit");
                break;
            }
        }

        System.out.println("Your Final Score is : " + score);
    }
}
