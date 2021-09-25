package Learning.learining;

import java.util.Stack;

public class Demo {


	public static void main(String[] args) {


		String str = "String s";
		Stack<Character> rev = new Stack<Character>();
		for(int i=0; i<str.length(); i++) 

			rev.add(str.charAt(i));
			int j= rev.size();
		for(int i=0; i<j; i++)

			System.out.print(rev.pop());

	}

}
