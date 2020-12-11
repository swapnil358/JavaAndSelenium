package javaLearning;

public class StaticArray {
	
	public static void main(String[] args) {
	
		//Advantage
		//  1. To store similar data type variable in a array variable
		//  2. We can assign multiple number in single data type
		
		//  Disadvantage
		//  1. Size is fixed - Static array - To overcome this problem we use Collections, Hash table --->Dynamic Array concept
		//  2. Store only similar data type array  - To overcome this problem we user OBJECT array
		
		
		
//integer Array
		
		System.out.println("*******integer ARRAY*******");
		
		//lowest bound/index = 0;
		//upper bound/index = n-1( n is size of array);
		
		
		int i[] = new int[4];
		
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3]= 40;
		
		//System.out.println(i[2]);
		//System.out.println(i[3]);
		//System.out.println(i[4]);   //ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		
		for(int j=0; j<i.length; j++ ) {
			
			System.out.println( i[j]);
		}
        
	
//Double Array

		System.out.println("*******Double ARRAY*******");
		
          double d[] = new double[3];
          
          d[0] = 13.22;
          d[1] = 14.55;
          d[2] = 15.66;
    
          System.out.println(d.length);
          	
          int j =0;
          while(j<d.length) {
        	  System.out.println(d[j]);
        	  j=j+1;
          }
          
          System.out.println("******************************");
          
          for(int s=0; s<d.length; s++ ) {
        	  System.out.println(d[s]);
          }
          System.out.println("*******Reverse double using while loop***********************");
              	  
        int m =2;
        	while(m<=d.length) {
        		System.out.println(d[m]);
        		m=m-1;
        	}
	
          
    
 //Character Array
        	
           System.out.println("*******Character ARRAY*******");
    		
        	
        char c[] = new char[3];
        
        c[0] = 'a';
        c[1] =  2;
        c[2]=  '$';
        System.out.println(c.length);
        
        System.out.println(c[1]);
        
        
  //Boolean Array
 
        
        boolean b[] = new boolean[2];
        
        b[0]= true;
        b[1] = false;
        
        System.out.println(b.length);
        
        
   //String Array -- --->String is not data type but it is Class
        
        String s[] = new String[2];
        
        s[0]= "Hello";
        s[1]= "World";
        
        System.out.println(s.length);
        		
        
        
 //Object Array --------> It used to store different data types values
        
        
        Object ob[] = new Object[10];
        
        ob[0]= "Tom";
        ob[1]= 20;
        ob[2] = 56.6;
        ob[3] = "30-nov";
        ob[4] = b;
        ob[5]= "landon";
        System.out.println("object array is equal to:"+ob.length);
        		
        		
        		
        		
        		
        		
        		
          }        
}	