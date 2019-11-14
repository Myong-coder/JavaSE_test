package calculations;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//求和练习
		Scanner j = new Scanner(System.in);
		System.out.println("请输入第一个数。");
		int a = j.nextInt();
		System.out.println("请输入第二个数。");
		int b = j.nextInt();
		int c = a+b;
		System.out.println("两数之和为："+c);	
		j.close();
		
		//强制类型转换练习
		int x = 98;
		long y = 100;//运算单元长度超过int则会被自动转化为int
		int z = (int)(x + y);
		System.out.println(z);
		
		byte w =1;
		byte q = 2;
		z = w + q; //运算单元长度小于int将会被自动转化为int
		byte g = (byte)(w+q);
		System.out.println(g);
		
		//自增运算练习                  
		int i = 1;
		int s = 0;
		s = ++i + i++ + ++i + ++i + i++;
		System.out.println(s);
	}

}


