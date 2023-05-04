import java.util.*;

public class A1113360_0421_2 {
    public static void main(String[] args) throws Exception {

        String check_1 = "[0-9]{4}/([0][1-9]{1}||[1][1-2]{1})/([0-2][0-9]{1}||[3][0-1]{1})";

        String check_2 = "([0][1-9]{1}||[1][1-2]{1})/([0-2][0-9]{1}||[3][0-1]{1})/[0-9]{4}";

        System.out.print("日期(YYYY/MM/DD or MM/DD/YYYY):");

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if(input.matches(check_1)||input.matches(check_2)){
           
            if(input.matches(check_1)){

                System.out.println(input.substring(0,4)+"年"+input.substring(5,7)+"月"+input.substring(8)+"日");

            }
            else{

                System.out.println(input.substring(0,2)+"月"+input.substring(3,5)+"日"+input.substring(6)+"年");

            }
               
              

        }
        else{

            System.out.println("格式錯誤");

        }
    
    
    
    }
}