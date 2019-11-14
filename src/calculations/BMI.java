package calculations;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		System.out.println("请输入您的姓名：");
		Scanner name = new Scanner(System.in);
		String c = name.nextLine();
		System.out.println("请输入您的身高：(单位：m)");
		Scanner height = new Scanner(System.in);
		float a = height.nextFloat();
		System.out.println("请输入您的体重：单位（kg）");
		Scanner weight = new Scanner(System.in);
		int b = weight.nextInt();
		weight.close();
		height.close();
		name.close();
		System.out.println("姓名："+c+"\n"+"BMI="+b/(a*a));
	}
}
