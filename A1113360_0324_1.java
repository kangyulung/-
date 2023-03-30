import java.util.*;
class animal {

  String name;
  double tall;
  double weight;
  double speed;

  void show(){

    System.out.println(name+"\t"+tall+"\t"+weight+"\t"+speed);

  }

  double distance(double x , double y){

    return x*y*speed;

  }

  double distance(double x ){

    return x*speed;
    
  }

}

public class A1113360_0324_1 {
  public static void main(String[] argv) {
    
    animal []Character = new animal[4];

    for(int i = 0 ; i <= 3; i++){

        Character[i] = new animal();

    }

    Character[0].name = "雪寶";
    Character[0].tall = 1.1;
    Character[0].weight = 52;
    Character[0].speed = 100;

    Character[1].name = "驢子";
    Character[1].tall = 1.5;
    Character[1].weight = 99;
    Character[1].speed = 200;

    Character[2].name = "安那";
    Character[2].tall = 1.7;
    Character[2].weight = 48;
    Character[2].speed = 120;

    Character[3].name = "愛沙";
    Character[3].tall = 1.7;
    Character[3].weight = 50;
    Character[3].speed = 120;

    System.out.println("項目名稱\t"+"身高(公尺)\t"+"體重(公斤)\t"+"速度(公尺/分鐘)");

    for(int i = 0 ; i <= 3 ; i++){

        Character[i].show();

    }

    

    Scanner sc = new Scanner(System.in);

    for(int i = 0 ; i <= 3 ; i++){
        
      double x , y ;

      System.out.println("請輸入"+Character[i].name+"的x(min):");
      x = sc.nextDouble();
      System.out.println("請輸入"+Character[i].name+"的y(加速度)(若無則輸入0):");
      y = sc.nextDouble();

      if ( y == 0 )
      System.out.println(Character[i].name+"奔跑的距離為:"+Character[i].distance(x));
      else
      System.out.println(Character[i].name+"奔跑的距離為:"+Character[i].distance(x,y));

    }

    sc.close();

 }



} 