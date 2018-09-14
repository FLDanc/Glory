public class Nursery{
	public static void main(String args[]){
		int N;
		for(N=99;N>=0;N--){
			if(N>1){
				System.out.println(N+"bottles of beer on the wall,"+N+" bottles of beer.");
				System.out.println("Take one down.");
				System.out.println("Pass it around.");
				System.out.println("----------------------------------------------------");
			}
			else if(N==1){
				System.out.println(N+"bottle of beer on the wall,"+N+" bottle of beer.");
				System.out.println("Take one down.");
				System.out.println("Pass it around.");
				System.out.println("----------------------------------------------------");
			}
			else
				System.out.println("No more bottle of beer on the wall.");
		}
	}
}