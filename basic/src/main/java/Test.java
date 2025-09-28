import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
//		
//		Integer num1 =1;
//		Integer num2 =1;
////		System.out.println(num1==num2);			//	false, false, true			//	-128 to 127
//		
//		Integer a1 =1000;
//		Integer a2 =1000;
////		System.out.println(a1==a2);				//	false, false, true			//	hashcode
//
//		
//		String s1 = "";
//		
//		String s2 = "Vikas";
//		String s3 = "Vikas";
//		
//		System.out.println(s2==s3);
//		System.out.println((s1+s2)==s3);		//	TURE
//		
//		

		Queue<Integer> que = new PriorityQueue<Integer>();

		que.add(20);
		que.add(30);
		que.add(10);
		que.add(5);
		que.add(50);

		System.out.println(que);
	}
}
