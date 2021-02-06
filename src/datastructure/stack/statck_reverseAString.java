package datastructure.stack;

import java.util.Stack;

public class statck_reverseAString {
	public static String reverse(String str)
	{
		Stack<Character> charStack=new Stack<>();
		char[] charArray=str.toCharArray();
		for(char c : charArray)
		{
			charStack.push(c);
		}
		// we can't use while (top!=null) because we don't have top pinter in pre-emplimented stack 
		for(int i=0;i<charArray.length;i++)
		{
			charArray[i]=charStack.pop();
		}
		return new String(charArray);
	}

	public static void main(String[] args) {
		String str="ABC DEF G";
		System.out.println("Original String was : "+str);
		System.out.println("Reverse String is : "+reverse(str));

	}

}
