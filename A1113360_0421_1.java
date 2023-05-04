import java.util.*;

public class A1113360_0421_1 {
    public static void main(String[] args) throws Exception {

        String check = "[a-z]+@[a-z]+(.[a-z]+)+";

        System.out.print("請輸入電子信箱:");

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if(input.matches(check)){

           System.out.println("格式正確");

        }
        else{

            System.out.println("格式錯誤");

        }
    
    
    
    }
}
