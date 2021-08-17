package voting;

import java.util.Scanner;



//import java.util.Scanner;

  public   class project3 {
        public static void main(String[]args){

            int input;
            System.out.println("enter your age:");
            Scanner s = new Scanner(System.in);
            input =  s.nextInt();
            if (input>18)
                System.out.println("you are eligible to vote");
            else {
                System.out.println("ypu are not eligible");
            }
        }
    }


