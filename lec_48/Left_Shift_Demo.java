package lec_48;

public class Left_Shift_Demo {
	public static void main(String[] args) {
		int n=5;
		System.out.println( n << 4); // 5 * 2^4;
		System.out.println(n << 3);// 5 * 2^3;
		System.out.println(n << 60);  // simple 5 * 2^60;
		
		// but for -ve shift : it work differently
		System.out.println(n << -30);  // 5 * (32-30); 
		System.out.println(n << -60);  // 5 * 2 ^ 32 -(60%32); => 5 * 2 ^ (32-28) => 5 * 2^4 
		System.out.println(n << -65); // 5 * 2 ^ (65%32); => 5 * 2 ^32 => which is out of range in integer (2^31 -1). So ans will be -ve integer val
		
		
		int n1= - 5;// here val is -ve 
		System.out.println(n1 << 3);// 5 * 2^3;
		System.out.println(n1 << -30);  // 5 * (32-30); 
		System.out.println(n1 << -60);  // - 5 * 2 ^ 32 -(60%32); => 5 * 2 ^ (32-28) => 5 * 2^4 
		System.out.println(n1 << -63);  // 10 
	}
}
