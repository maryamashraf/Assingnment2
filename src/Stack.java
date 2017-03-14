/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Azmat Chand
 */

    
import java.util.*;
public class Stack 
{
	static Scanner sc = new Scanner(System.in);
	static int stack[] , top=-1,size;
	static
	{
		Stack.creat();
	}
	public static void main(String[] args)
	{
		int choice, item;
		while(true)
		{
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: Display");
			System.out.println("4: Quit");
			System.out.print("Eneter Your Choice:");
			choice=Stack.sc.nextInt();
			switch(choice)
			{
			case 1: System.out.print("Eneter Element:");
				item=Stack.sc.nextInt();
				Stack.Push(item);
                                break;
			case 2: item=Stack.Pop();
					if(item==0)
					{
						System.out.println("Stack Underflow:");
					}
					else
					{
						System.out.println("Poped Item:"+item);
					}
					break;
			case 3: Stack.Display();
					break;
			case 4: Quit(1);
			default:
				System.out.print("Invalid Choice\t");
						
			}
		}
	}
	private static void Quit(int i)
        {	
	}
	static void creat()
	{
		System.out.println("Enter  size of Stack:");
		size=Stack.sc.nextInt();
		Stack.stack=new int[size];
		System.out.println("Stack created successfully with size:"+size);
	}
	static void Push(int item)
	{
		if(Stack.isFull())
		{
			System.out.println("Stack is Overflow.");
			
		}
		else
		{
			Stack.stack[++top]=item;
			
		}
	}
	static boolean isFull()
	{
                if(top==size-1)
                {
                    return true;
                }
                else
                {
                    return false;
                }
	}
	static int Pop()
	{
		if(Stack.IsEmpty())
		{
			return 0;
		}
		else
		{
			return stack[top--]; 
		}
	}
	static boolean IsEmpty()
           /* for bolian value */    
	{
            if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static void Display()
	{
		if(Stack.IsEmpty())
		{
			System.out.println("Stack is Empty:");
		}
		else
		{
			System.out.println("Elements of stack is:");
			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]);
			}
		}
	}
}