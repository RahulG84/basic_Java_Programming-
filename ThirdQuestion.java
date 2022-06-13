package Class3;
import java.util.*;
public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int b = Input.nextInt();
        if (a == b){
            System.out.println("Equal");
        }else {
            if (a > b){
                System.out.println("a is greater than b");
            }
            else {
                System.out.println("a is lesser than b");
            }
        }
    }
}
