package day03;

public class VariableArguments {

	public static int sum(int...nums) {
		int sum = 0;
		for(int x: nums) {
			sum += x ;
		}
		return sum ;
	}
	
	static double avg(double...nums) {
		double sum = 0 ;
		for(double x: nums) {
			sum += x ;
		}
		return (sum/nums.length) ;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4));
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3,5,6));
		System.out.println(sum(1,2,3,8,9));
		
		System.out.println(avg(1.2, 2,4));
		System.out.println(avg(3, 4.5));
	}

}
