public class test1{
	public static void main(String args[]){
		String a;
		String c="www";
		a=c;
		System.out.println("a="+a);
		System.out.println("c="+c);
		System.out.println("Before a");
        	System.out.println(a.getBytes());
		System.out.println("Before c");
        	System.out.println(c.getBytes());
		System.out.println("------");

		a="zzz";
		System.out.println("a="+a);
		System.out.println("c="+c);
		System.out.println("After a");
        	System.out.println(a.getBytes());
		System.out.println("After c");
        	System.out.println(c.getBytes());
	}
}