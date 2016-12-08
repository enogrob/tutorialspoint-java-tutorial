/**
 * Created by enogrob on 08/12/16.
 */
public class DecisionMaking {
    public static void main(String args[]) {
        int x = 30;

        if( x == 10 ) {
            System.out.print("Value of X is 10");
        }else if( x == 20 ) {
            System.out.print("Value of X is 20");
        }else if( x == 30 ) {
            System.out.print("Value of X is 30");
        }else {
            System.out.print("This is else statement");
        }

        char grade = 'C';

        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);

    }
}
