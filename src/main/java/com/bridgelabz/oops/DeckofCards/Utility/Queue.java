package com.bridgelabz.oops.DeckofCards.Utility;

import java.util.LinkedList;
//taking a queue class from linked list
public class Queue<T> {
	 LinkedList<T> LinkedList;
		public Queue()
		{
			LinkedList=new LinkedList<T>();
		}
		//adds the element at end of list.
		public  void enqueue(T data)
		{
			LinkedList.add(data);
		}
		//removes the element from list.
		public  T dequeue()
		{
			return LinkedList.pop();
		}
		//return true if the list is empty else false.
		public boolean isEmpty()
		{
			return LinkedList.isEmpty();
		}
		//return the size.
		public int size()
		{
			return LinkedList.size();
		}
}