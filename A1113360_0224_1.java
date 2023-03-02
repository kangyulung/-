import java.util.*;
public class A1113360_0224_1 {
    public static void main (String [] argv) {
        int num;
        System.out.println ("請輸入任意整數");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if((num==1) || (num==0)){
            if(num==0){
                System.out.println ("是偶數");
            }
            else{
                System.out.println ("是奇數");
            }
        }
        else{
          if(num%2==0){
              System.out.println ("是偶數");
          }
          else{
              System.out.println ("是奇數");
          }
        }
      }
}
