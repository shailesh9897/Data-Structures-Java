package datastructure.stack;

import java.util.Stack;

public class statck_Evaluate_Postfix {
	 public static void evaluatePostFix(String str) {
	        
	        Stack<Integer> stack=new Stack<>();
	        for(char c: str.toCharArray())
	        {
	            if(Character.isDigit(c))
	            {
	            	stack.push(c-'0');//ascii value of 0 is 48 so on subtracting the character we get correct value in int
	            	
	            }
	            
	            else {
	                int A=stack.pop();
	                int B=stack.pop();
	               
	                
	                if (c == '+') {
	                    stack.push(B + A);
	                }
	                else if (c == '-') {
	                    stack.push(B - A);
	                }
	                else if (c == '*') {
	                    stack.push(B * A);
	                }
	                else if (c == '/') {
	                    stack.push(B / A);
	                }
	                
	                
	                /*using switch
	                 * switch(c) 
                { 
                    case '+': 
                    stack.push(B+A); 
                    break; 
                      
                    case '-': 
                    stack.push(B- A); 
                    break; 
                      
                    case '/': 
                    stack.push(B/A); 
                    break; 
                      
                    case '*': 
                    stack.push(B*A); 
                    break; 
              } 
	                 * 
	                 * 
	                 * 
	                 * 
	                 */
	                
	                
	                
	                
	            }
	        }
	        
	        System.out.println(stack.pop());
	    }

	public static void main(String[] args) {
		String str="23*54*+9-";
		System.out.println("Your Postfix exprn was : "+str);
		evaluatePostFix(str);

	}

}
