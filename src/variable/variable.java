//变量练习
package variable;

public class variable {
	double i = 3.1415926;
	double j = 2.17143123;
	int day = 365;
	int x = 12;
	char c = '吃';
	boolean q = false;
	String name = "不可描述";
//变量的作用域
	double method(double i) {
		System.out.println(i);
		return i;
	}
	public static void main(String[] args) {
		new variable().method(2.172512);
	}
}
//当i（变量）被多个环境影响时就近赋值；