package lec_25;

public class Test_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = { '9', '9', '9', '9' };
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]-'0' == 9) {
				arr[i] = (char) (i+'0');		
			}
//			arr[i] = '0';
		}
		
		for(char elm : arr) {
			System.out.println(elm);
		}
	}

}
