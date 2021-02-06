package datastructure.stack;

import java.util.Stack;

public class Implement_Two_Stack_In_One_Array {
	private int top1,top2;
	private int arr[];
	private int size;
	//constructor to initialize variables
	public Implement_Two_Stack_In_One_Array(int n) {
		this.top1=-1;
		this.top2=size;
		this.size=n;
		this.arr=new int[5];
	}
	
	//Method to push data in stack-1
	public void push1(int n)
	{
		if(top1 < top2-1)
		{
			top1++;
			arr[top1]=n;
			
		}
		else
		{
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}
	
	public void push2(int n)
	{
		if(top1 < top2-1)
		{
			top2--;
			arr[top2]=n;
			
		}
		else
		{
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}
	 

	public static void main(String[] args) {
		

	}

}
