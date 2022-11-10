import java.util.Scanner;

public class Bmi{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                double height;
		double height2;
                int weight;
		int weight2;
                System.out.println("1人目の身長を入力してください。(Mで入力してください。)");
                height=sc.nextDouble();
		System.out.println("2人目の身長を入力してください。(Mで入力してください。)");
                height2=sc.nextDouble();
                System.out.println("1人目の体重を入力してください。");
                weight=sc.nextInt();
		System.out.println("2人目の体重を入力してください。");
                weight2=sc.nextInt();
                double bmi=weight/(height*height);
	　　　　double bmi2=weight2/(height2*height2);
                System.out.println("1人目ののBMIは"+(Math.floor((bmi*100))/100)+"です。");
		System.out.println("2人目ののBMIは"+(Math.floor((bmi2*100))/100)+"です。");
  }
}

