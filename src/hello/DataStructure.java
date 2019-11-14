package hello;

public class DataStructure {
	int printN(int n) {
		boolean i = true;
		if(n<0) {
		i=false;
		}
		if(i)
		printN(n-1);	
		System.out.println(n);
		return n;
		}
	public static void main(String[] args) {
	DataStructure printZ = new DataStructure();
	printZ.printN(1000);
	
}
}
