package DataType;

public class Datatypes {
	
	  public static void main(String[] args) {
		
		//bytes stores range =-127 to 127
		
		byte a=127;
		System.out.println("value of a is in the range of byte="+a);
		
		//if i execute the range in byte 
		
		/*byte b=128;
		System.out.println("value of a is in the range of byte="+b);
		
		error : Type mismatch: cannot convert from int to byte
		*/
		
		// shorts range value =-32,768 to 32,767
		short b=129;
		System.out.println("short store this value:"+b);
		
		
		// integer store integer and by default value is 4 byte 
		//range = -2147,483, 648 to -2147, 483,647
		int d=+922222;
		System.out.println ("phone number is ="+d);
		
		//long if need more memory the used long other wise used int for integer 
		
		long f=1234567890;
		System.out.println("long value "+f);
	}


}
