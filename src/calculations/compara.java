package calculations;

import java.util.Scanner;

public class compara {
public static void main(String[] args) {
	System.out.println("请输入第一个数：");
	Scanner firstone = new Scanner(System.in);
	int a = firstone.nextInt();
	System.out.println("请输入第二个数：");
	Scanner lastone = new Scanner(System.in);
	int b = lastone.nextInt();
	firstone.close();
	lastone.close();
//	if(a>b)System.out.println(a+">"+b+"ture");
//	else System.out.println(a+">"+b+"false");
//	if(a>=b)System.out.println(a+">="+b+"ture");
//	else System.out.println(a+">="+b+"false");
	System.out.println("比较"+a+"和"+b+"的大小："+"a>b的结论为："+(a>b));
	System.out.println("比较"+a+"和"+b+"的大小："+"a>=b的结论为："+(a>=b));
	System.out.println("比较"+a+"和"+b+"的大小："+"a<b的结论为："+(a<b));
	System.out.println("比较"+a+"和"+b+"的大小："+"a<=b的结论为："+(a<=b));
	System.out.println("比较"+a+"和"+b+"的大小："+"a==b的结论为："+(a==b));
	System.out.println("比较"+a+"和"+b+"的大小："+"a!=b的结论为："+(a!=b));
}
}
