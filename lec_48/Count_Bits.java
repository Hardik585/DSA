package lec_48;

public class Count_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = -2147483645;
		System.out.println(byAnd(n));
		System.out.println(byShift(n));
		System.out.println(n >>> 1);

	}
	
	public static int byAnd(int n ) {
		int c =0; 
		while(n>0) {
			n = n&(n-1);
			c++;
		}
		return c;
	}
//	1073741822  -1073741823
	
	public static int byShift(int n ) {
		int c =0; 
		while(n>0) {
			if((n & 1) == 1) {
				c++;
			}
			n = n  >>> 1;
		}
		return c;
	}

}
