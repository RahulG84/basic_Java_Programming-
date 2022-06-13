package Class3;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int botton = Input.nextInt();
//        if (botton == 1){
//            System.out.println("Hello");
//        } else if (botton == 2) {
//            System.out.println("Namaste");
//        } else if (botton == 3) {
//            System.out.println("Holla");
//
//        }
//        else {
//            System.out.println("Invalid botton");
//
//        }
        switch (botton){
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("namste");
                break;
            case 3 :
                System.out.println("Holla");
                break;
            default:
                System.out.println("Invalid Botton");
        }
    }

}
