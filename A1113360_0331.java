import java.util.*;
class animal {

  String name;
  double tall;
  int weight;
  int speed;

  animal(String a,double b,int c,int d){

    name = a;
    tall = b;
    weight = c;
    speed = d;
  }

  void show(){

    System.out.println(name+"\t"+tall+"\t"+weight+"\t"+"\t"+"\t"+speed);

  }

  double distance(double x , double y){

    return x*y*speed;

  }

  double distance(double x ){

    return x*speed;
    
  }

  static void showinfo(){

    System.out.println("歡迎進入冰雪奇緣系統");

  }

}

class human extends animal{

  char gender;

  human (String a,double b,int c,int d,char e){

    super(a,b,c,d);
    gender = e;

  }
  
  void show(){

    System.out.println(name+"\t"+tall+"\t"+weight+"\t"+gender+"\t"+"\t"+speed);

  }
}

class snow extends human{

  String skill;

  snow(String a,double b,int c,int d,char e,String f){
    
    super(a,b,c,d,e);
    skill = f;

  }

  void show(){

    System.out.println(name+"\t"+tall+"\t"+weight+"\t"+gender+"\t"+skill+"\t"+speed);

  }

  double distance(double x , double y){

    return x*y*speed*2;

  }

  double distance(double x ){

    return x*speed*2;
    
  }
}

public class A1113360_0331 {
  public static void main(String[] argv) {

    animal.showinfo();

    animal Characte_1 = new animal("雪寶",1.1,52,100);
    animal Characte_2 = new animal("驢子",1.5,99,200);
    human Characte_3 = new human("阿克",1.9,80,150,'男');
    human Characte_4 = new human("漢斯",1.8,78,130,'男');
    human Characte_5 = new human("安那",1.7,48,120,'女');
    snow Characte_6 = new snow("愛沙",1.7,50,120,'女',"Yes");
    

    System.out.println("項目名稱\t"+"身高(公尺)\t"+"體重(公斤)\t"+"性別\t"+"冰凍技能"+"速度(公尺/分鐘)");

    
    Characte_1.show();
    Characte_2.show();
    Characte_3.show();
    Characte_4.show();
    Characte_5.show();
    Characte_6.show();
    
    Scanner sc = new Scanner(System.in);

      double x , y ;

      System.out.println("請輸入"+Characte_1.name+"的x(min):");
      x = sc.nextDouble();
      System.out.println("請輸入"+Characte_1.name+"的y(加速度)(若無則輸入0):");
      y = sc.nextDouble();

      if ( y == 0 )
      System.out.println(Characte_1.name+"奔跑的距離為:"+Characte_1.distance(x));
      else
      System.out.println(Characte_1.name+"奔跑的距離為:"+Characte_1.distance(x,y));

      System.out.println("請輸入"+Characte_2.name+"的x(min):");
      x = sc.nextDouble();
      System.out.println("請輸入"+Characte_2.name+"的y(加速度)(若無則輸入0):");
      y = sc.nextDouble();

      if ( y == 0 )
      System.out.println(Characte_2.name+"奔跑的距離為:"+Characte_2.distance(x));
      else
      System.out.println(Characte_2.name+"奔跑的距離為:"+Characte_2.distance(x,y));

      System.out.println("請輸入"+Characte_3.name+"的x(min):");
      x = sc.nextDouble();
      System.out.println("請輸入"+Characte_3.name+"的y(加速度)(若無則輸入0):");
      y = sc.nextDouble();

      if ( y == 0 )
      System.out.println(Characte_3.name+"奔跑的距離為:"+Characte_3.distance(x));
      else
      System.out.println(Characte_3.name+"奔跑的距離為:"+Characte_3.distance(x,y));

      System.out.println("請輸入"+Characte_4.name+"的x(min):");
      x = sc.nextDouble();
      System.out.println("請輸入"+Characte_4.name+"的y(加速度)(若無則輸入0):");
      y = sc.nextDouble();

      if ( y == 0 )
      System.out.println(Characte_4.name+"奔跑的距離為:"+Characte_4.distance(x));
      else
      System.out.println(Characte_4.name+"奔跑的距離為:"+Characte_4.distance(x,y));

      System.out.println("請輸入"+Characte_5.name+"的x(min):");
      x = sc.nextDouble();
      System.out.println("請輸入"+Characte_5.name+"的y(加速度)(若無則輸入0):");
      y = sc.nextDouble();

      if ( y == 0 )
      System.out.println(Characte_5.name+"奔跑的距離為:"+Characte_5.distance(x));
      else
      System.out.println(Characte_5.name+"奔跑的距離為:"+Characte_5.distance(x,y));

      System.out.println("請輸入"+Characte_6.name+"的x(min):");
      x = sc.nextDouble();
      System.out.println("請輸入"+Characte_6.name+"的y(加速度)(若無則輸入0):");
      y = sc.nextDouble();

      if ( y == 0 )
      System.out.println(Characte_6.name+"奔跑的距離為:"+Characte_6.distance(x));
      else
      System.out.println(Characte_6.name+"奔跑的距離為:"+Characte_6.distance(x,y));

    sc.close();

 }



} 