//2. Write a java program for  Unboxing.(all types).
package oopsfeature;

public class UnboxingTask {

	public static void main(String[] args) {
		System.out.println("Unboxing.......");
		//Unboxing for int
		Integer i=new Integer(66);
		int a=i.intValue();
		System.out.println(a);

		//Unboxing for short
		Short sh = 20;
		short sh1 = sh.shortValue(); 
		System.out.println( sh1);

		//Unboxing for char
		Character c=new Character('A');
		char ch=c.charValue();
		System.out.println(ch);

		//Unboxing for double
		Double d=new Double(60.6);
		double dob=d.doubleValue();
		System.out.println(dob);

		//Unboxing for long
		Long l=new Long(40L);
		long lo=l.longValue();
		System.out.println(lo);

		//Unboxing for byte
		Byte bt = 10;
		byte by = bt.byteValue(); 
		System.out.println(by);

		//Unboxing for float
		Float f=new Float(5.5f);
		float fl=f.floatValue();
		System.out.println(fl);

		//Unboxing for boolean
		Boolean b1=new Boolean(true);
		boolean bo=b1.booleanValue();
		System.out.println(bo);

	}

}

/*Output
 Unboxing.......
 66
 20
 A
 60.6
 40
 10
 5.5
 true
 */
