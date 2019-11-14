package calculations;

import java.util.Scanner;

public class Three {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("请输入日期：");
	int weekday = s.nextInt();
	System.out.println(weekday<=6?"工作日":"周末");
	s.close();
}
}
