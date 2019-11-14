package calculations;

public class Logic {
public static void main(String[] args) {
	int i = 1;
	boolean b = !(i++ == 3)^(i++ == 2)&&(i++ == 3);//与操作前面运算式为假后面运算式不会参与运算
	System.out.println(b+"\n"+i);
}
}
