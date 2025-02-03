//1. Write a java program for Autoboxing.(All Primitive Types)
package oopsfeature;

public class AutoboxingTask {

	public static void main(String[] args) {
		System.out.println("Autoboxing.....");
		// Autoboxing for int
		int a=30;
		Integer i=Integer.valueOf(a);//explicit conversion
		System.out.println(i);

		// Autoboxing for short
		short b=20;
		Short sh=Short.valueOf(b);//explicit conversion
		System.out.println(sh);

		// Autoboxing for char
		char c='A';
		Character ch=Character.valueOf(c);//explicit conversion
		System.out.println(ch);

		// Autoboxing for double
		double d=60.6;
		Double dob=Double.valueOf(d);//explicit conversion
		System.out.println(dob);

		// Autoboxing for long
		long l=40L;
		Long lo=Long.valueOf(l);//explicit conversion
		System.out.println(lo);

		// Autoboxing for byte
		byte b1=10;
		Byte by=Byte.valueOf(b1);//explicit conversion
		System.out.println(by);

		// Autoboxing for float
		float f=40.5f;
		Float f1=Float.valueOf(f);//explicit conversion
		System.out.println(f1);		

		// Autoboxing for boolean
		boolean bool = true;
		Boolean bobj = Boolean.valueOf(bool);//explicit conversion
		System.out.println(bobj);


	}

}

/*Output:
 Autoboxing.....
 30
 20
 A
 60.6
 40
 10
 40.5
 true
 */
