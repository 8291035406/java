import java.util.*;
public class Ass2 {
    public static void main(String args[]){
        int Start_Number, End_number,Sum=0;
        // we are find sum of natural number from starting number to end number.
        System.out.println("Enter starting number : ");
        Scanner s = new Scanner(System.in);
        Start_Number = s.nextInt();
        System.out.println("Enter end number : ");
        End_number = s.nextInt();

        for(;Start_Number <= End_number; Start_Number++)
        {
            Sum = Sum + Start_Number;

        }
        System.out.println("Sum of natural number from "+Start_Number+" to "+End_number+" is "+Sum);
    }
}
