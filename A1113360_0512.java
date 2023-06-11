import java.util.Scanner;

class Customer extends Thread{

    static int pork=5000;
    static int beef=3000;
    static int veg=1000;
    String name;
    boolean status=false;

    public Customer(String name){
        
        this.name=name;
    }
    public void run(){
        
        while(status==false){
            
            int selectDumpling=(int)(Math.ceil(Math.random()*3));
            
            int noDumpling=(int)(Math.ceil(Math.random()*50));
            
            eatCount(name, selectDumpling, noDumpling);
            try {
                
                sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
    public synchronized void eatCount(String b, int x, int y){
        String name=b;
        int eatDumpling=x;
        int noeatDumpling=y;
        
        if (eatDumpling==1){
            
            if(pork==0){
                System.out.println("顧客:"+name+"來了");
                System.out.println("豬肉水餃已經賣完不能再點");
            }else{
                
                if(noeatDumpling>pork){
                    System.out.println("顧客:"+name+"來了");
                    System.out.println("賣出豬肉水餃:"+pork);
                    pork-=pork;
                    System.out.println("豬肉水餃還剩:"+pork);  
                }else{
                    //扣水餃
                    pork-=noeatDumpling;
                    System.out.println("顧客:"+name+"來了");
                    System.out.println("賣出豬肉水餃:"+noeatDumpling);
                    System.out.println("豬肉水餃還剩:"+pork);  
                }
            }
        }else if(eatDumpling==2){
            if(beef==0){
                System.out.println("顧客:"+name+"來了");
                System.out.println("牛肉水餃已經賣完不能再點");
            }else{
                if(noeatDumpling>beef){
                    System.out.println("顧客:"+name+"來了");
                    System.out.println("賣出牛肉水餃:"+beef);
                    beef-=beef;
                    System.out.println("牛肉水餃還剩:"+beef);  
                }else{
                    beef-=noeatDumpling;
                    System.out.println("顧客:"+name+"來了");
                    System.out.println("賣出牛肉水餃:"+noeatDumpling);
                    System.out.println("牛肉水餃還剩:"+beef);   
                }              
            }
        }else if(eatDumpling==3){
            if(veg==0){
                System.out.println("顧客:"+name+"來了");
                System.out.println("蔬菜水餃已經賣完不能再點");
            }else{
                if(noeatDumpling>veg){
                    System.out.println("顧客:"+name+"來了");
                    System.out.println("賣出蔬菜水餃:"+veg);
                    veg-=veg;
                    System.out.println("蔬菜水餃還剩:"+veg);  
                }else{
                    veg-=noeatDumpling;
                    System.out.println("顧客:"+name+"來了");
                    System.out.println("賣出蔬菜水餃:"+noeatDumpling);
                    System.out.println("蔬菜水餃還剩:"+veg);
                }
            }
        }

        if(pork==0 && beef==0 && veg==0){
            status=true;
        }
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        

    System.out.println("請輸入顧客數目");
    Scanner scanner=new Scanner(System.in);
    int numCustomer = scanner.nextInt();
    Customer[] customer = new Customer[numCustomer];
    for(int i=0 ; i<numCustomer ;i++){

       customer[i]=new Customer("顧客"+i);

    }

    for(int i=0 ; i<numCustomer ;i++){

       customer[i].start();

    }

    }
}
