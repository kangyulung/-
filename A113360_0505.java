import java.util.*;
import java.io.*;

public class A113360_0505 {
    public static void main(String[] args) throws IOException {

        int [] ans = {8,8,8,8,8,8};
        int [] input = {0,0,0,0,0,0};

        int i = 0 ;

        Scanner sc = new Scanner(System.in);

        
        try{
            while(i<6){
              System.out.print("請輸入第"+(i+1)+"個整數(共6個)");

              input[i] = sc.nextInt();

              if( input[i]>49 || input[i]<1 )
                 throw new AbstractMethodError(); 
                           
              i++;
            }
            
            for(int a = 0;a<6;a++){

              if(input[a] != ans[a]){
                System.out.println("尷尬，沒中獎");
                break;
                }
              else if(a == 5)
                System.out.println("恭喜中獎");
            }
            
           
        }
        catch (AbstractMethodError e){
            System.out.println("您輸入的數值不再範圍內(1~49)");
            System.out.println("程式結束");
        }

    }
}
