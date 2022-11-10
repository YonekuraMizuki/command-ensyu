import java.util.Scanner;

public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                double height;
                int weight;
                System.out.println("身長を入力してください。(Mで入力してください。)");
                height=sc.nextDouble();
                System.out.println("体重を入力してください。");
                weight=sc.nextInt();
                double bmi=weight/(height*height);
                System.out.println("あなたのBMIは"+(Math.floor((bmi*100))/100)+"です。");
  }
}

