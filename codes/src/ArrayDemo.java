

class Calc{
	public int add(int ... i) {
		int sum=0;
		for(int k:i) {
			sum+=k;
		}
		return sum;
	}
}


public class ArrayDemo {

	public static void main(String[] args) {
		int arr[] = new int[4];
		int arr2[] = {1,2,3,4};
		Calc obj  = new Calc();
		System.out.println(obj.add(1,2,3,4));
		
		

	}

}
