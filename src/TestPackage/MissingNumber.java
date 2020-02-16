package TestPackage;

//https://youtu.be/opJ0Vhok01U?list=PLFGoYjJG_fqr84PKCp88iPkQDWJSfzaqz


public class MissingNumber {

	public static void main(String[] args) {

		int a[] = { 1,2,4};

		
		int sum = 0;
		
		//System.out.println(a.length);
		
		for(int i=0; i<a.length; i++) {
			
			sum= sum+ a[i];
		}
		System.out.println(sum);
		
		
		int sum1 = 0;    //1+3+6+10
		
		for(int j = 1; j<=4; j++) {
			
			
			sum1 = sum1+j;
		}

	System.out.println(sum1-sum);
	}
	

}
	

