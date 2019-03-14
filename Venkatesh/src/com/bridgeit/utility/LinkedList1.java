package com.bridgeit.utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgeit.utility.LinkedList.Node;

public class LinkedList1<T>
{
static Node head;
	
	public static class Node<T>
	{
		T data;
		Node<T> next;
		
		Node(T d)
		{
			data=d;
			next=null;
		}
	}
	
	public int size()
	{
		int count=0;
		Node<T> temp=head;
		int i=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		System.out.println("size:"+count);
		return count;
	}
	
	public  T last(T new_data)
	{
		Node new_node=new Node(new_data);
		
		if(head==null)
		{
			head=new_node;
			System.out.printf("%4d",new_node.data);
			return null;
		}
		else
		{	
			new_node.next=null;
			Node last=head;
			//System.out.printf("%4 ",new_node.data);
			while(last.next!=null)
			{
				last=last.next;
			}
			System.out.printf("%4d",new_node.data);
			last.next=new_node;
			
		}
		return new_data;
	}
	
	public T push(T new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	
		return new_data;
	}
	
	public boolean find(String key)
	{

		Node<String> temp=head;
		while(temp!=null)
		{
			if(temp.data.compareTo(key)==0)
			return true;
			temp=temp.next;
		}
		return false;
	}
	
	public T search(String key)
	{
		Node<String> temp=head;
		Node prev_node=head;
		
		while(temp.data.compareTo(key)!=0)
		{
			
			temp = temp.next;
			
		}
		
		while(prev_node.next != temp)
		{
			
			prev_node = prev_node.next;
		}
		prev_node.next=temp.next; 
		temp.next=null;
		return null;
	
	}
	public void add(String data)
	{
		Node temp = new Node(data);
		
		if(head==null)
		{
			head = temp;
		}
		else
		{
			Node p;
			p = head;
			while(p.next != null)
			{
				p = p.next;
			}
			p.next = temp;
		}
	}
	
	public T print()
	{
		Node temp=head;
		
		System.out.println("linkedlist:");
		while(temp!=null)
		{
			
			System.out.println(temp.data);
			temp=temp.next;	
			
		}
		return null;
		
	}
	public void displayList()
	{
		Node temp;
			temp =head;
			while(temp!= null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		
	}
	
	public static void write()
	{
		int i,j;
		String str = "";
		String space="";
		
		Node temp=head;
		while(temp!=null) 
		{
			str=str.trim()+" "+temp.data.toString().trim();
			
			temp=temp.next;
		}

		String arr[]=str.split(" ");
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])<0)
				{
					String temp1=arr[i];
					arr[i]=arr[j];
					arr[j]=temp1;
					
				}
			}
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/admin1/eclipse-workspace/Venkatesh/doc1")))
		{
			for(i=0;i<arr.length;i++)
			{
				space=arr[i]+" "+space.toString().trim();
			}
			bw.write(space);
			System.out.println("Done");
			bw.close();

		} 
		
		catch (IOException e) 
		{

			e.printStackTrace();
		
		}
		
	}
	public void write1()
	{
		String str = "";
		Node temp=head;
		while(temp!=null) 
		{
			str=str.trim()+" "+temp.data.toString().trim();
			
			temp=temp.next;
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/admin1/eclipse-workspace/Venkatesh/doc1")))
		{
			bw.write(str);
			System.out.println("Done");
			bw.close();

		} 
		
		catch (IOException e) 
		{

			e.printStackTrace();
		
		}
		
	}
	
}
