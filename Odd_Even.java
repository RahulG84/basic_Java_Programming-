package Class3;
import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int x = Input.nextInt();

        if (x % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
