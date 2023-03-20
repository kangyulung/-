import java.util.*;

public class A1113360_0317_1 {
    public static void main(String[] argv) {
        
      int n,m;

      Scanner sc = new Scanner(System.in);

      System.out.println("請輸入n");
      n = sc.nextInt();

      System.out.println("請輸入m");
      m = sc.nextInt();

      sc.close();

      int [][] arr = new int [n][m];

      for(int i=0 ; i < arr.length ; i++){
        for(int x=0 ; x < arr[i].length ;x++){
          
            arr[i][x] = (i+1)*(x+1);

        }
      }
      
      for( int[] arr2 : arr ){

        int first_num = 0;

        for( int ans : arr2 ){

            if(first_num != 0)
              System.out.print("," + ans);
            else
              System.out.print(ans);

            first_num = 1;  

        }

        System.out.println();

      }
    }
}