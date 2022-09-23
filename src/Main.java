import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i,j,k;

        Scanner s= new Scanner(System.in);
        System.out.println("enter no 1 : ");
        i = s.nextInt();
        System.out.println("enter no 2 : ");
        j = s.nextInt();
        System.out.println("numbers before swapping : "+i+" "+j);
        k = i;
        i = j;
        j = k;
        System.out.println("number after swapping : "+i+" "+j);
    }
}