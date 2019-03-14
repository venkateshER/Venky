package com.bridgeit.utility;


/**
 * 
 * @author Venkatesha E R
 * date:09/03/19
 *
 * @param <T>
 */
public class Queue<T> 
{
	LinkedList ls=new LinkedList();
	private static Object arr[] ;         
	private static int front;        
	public static int rear;        
	public static int capacity;      
	private static int count;        
	
	
	public Queue(int size )
	{
		arr =new Object[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	} 
	public static class Node<T>
	{
		T data;
		T next;
		
		Node(T d)
		{
			data=d;
			next=null;
		}
	}
	public static int size()
	{
		return count;
	}

	
	public static Boolean isEmpty()
	{
		return (size() == 0);
	}


	public Boolean isFull()
	{
		return (size() == capacity);
	}
	
	
	public void dequeue()
	{
		
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		else
		{
		System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		count--;
		}
	}

	
	public void enqueue(T new_data)
	{
		Node<T> new_node=new Node(new_data);
		
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}

		//System.out.print(" "+ new_node.data);

		rear = (rear + 1) % capacity;
		arr[rear] =ls.last(new_data);
		count++;
	}
	
	public static String peek()
	{
		if (isEmpty()) 
		{
			System.out.println("UnderFlow\nProgram Terminated");
			return null;
		}
		return (String) arr[front];
	
	}
	
	static void queueDisplay() 
	{ 
		int i; 
		if (front >rear) 
		{ 
			System.out.println("Queue is Empty"); 
			return; 
		} 

    
		for (i = front; i <= rear; i++) 
		{ 
			System.out.println(arr[i]); 
		} 
		return; 
	} 



}
