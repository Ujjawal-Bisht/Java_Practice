package day05;

public class UseStaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend f1 = new Friend("xyz") ;
		Friend f2 = new Friend("abc") ;
		
//		System.out.println(f1.numOfFriends);

		System.out.println(Friend.numOfFriends);
		System.out.println(Friend.numOfFriends);
		
		Friend f3 = new Friend("mnop") ;
		System.out.println(Friend.numOfFriends);
		
		// Without static keyword no. of friends will always remain 1, because each friend will reinitialize variable "noOfFriends" to 0.

		
		Friend.showFriends();
	}

}
