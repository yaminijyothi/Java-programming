package com.bridgelabz.oops.DeckofCards.Utility;

//linked list in generic manner
public class LinkedList<T extends Comparable<T>>{

	//pointing to node.
	MyNode<T> head;
	MyNode<T> current;class MyNode<T>
	{
		T data; // data to be stored.
		MyNode<T> next; // ref to next node.
		MyNode(T data)
		{
			this.data=data;
			next=null;
		}
	}
	int position;
	public LinkedList()
	{
		head=null;
		current=null;
		position=-1;
	}
	public void add(T data) {
		MyNode<T> node = new MyNode<T>(data);

		if (head == null)
		{
			head = node;
			current=head;
		}
		else if(head.data.compareTo(data)>0)
		{

			node.next=head;
			head=node;class MyNode<T>
			{
				T data; // data to be stored.
				MyNode<T> next; // ref to next node.
				MyNode(T data)
				{
					this.data=data;
					next=null;
				}
			}

		}
		else if(current.data.compareTo(data)<0)
		{
			current.next=node;
			current=node;
		}
		else
		{
			MyNode<T> tempPrev=head;
			MyNode<T> tempCurrent=head.next;
			while((tempCurrent!=current)&&(tempCurrent.data.compareTo(data)<0))
			{
				tempPrev=tempCurrent;
				tempCurrent=tempCurrent.next;
			}
			tempPrev.next=node;
			node.next=tempCurrent;class MyNode<T>
			{
				T data; // data to be stored.
				MyNode<T> next; // ref to next node.
				MyNode(T data)
				{
					this.data=data;
					next=null;
				}
			}

		}
		position++;
	}
	//removes given element from list
	public void remove(T data)
	{
		MyNode<T> tempCurrent=head;
		MyNode<T> tempPrev=null;
		while(tempCurrent.data !=data)
		{
			tempPrev=tempCurrent;
			tempCurrent=tempCurrent.next;
		}
		if(tempCurrent==head)
		{
			head=head.next;
		}
		else
		{
			tempPrev.next=tempCurrent.next;
		}
		if(tempCurrent==current)
		{
			current=tempPrev;class MyNode<T>
			{
				T data; // data to be stored.
				MyNode<T> next; // ref to next node.
				MyNode(T data)
				{
					this.data=data;
					next=null;
				}
			}

		}
		position--;
	}
	//data elements to be searched in list & return true if the element is in the list else false.
	public boolean search(T data)
	{
		if(contains(data)==-1)
		{
			return false;
		}
		return true;

	}
	public int contains(T data)
	{
		if(position==-1)
		{
			return -1;
		}
		MyNode<T> tempCurrent=head;
		int tempPosition=0;
		while(tempCurrent.data !=data)
		{
			if(tempCurrent==current)
			{
				return -1;

			}
			tempCurrent=tempCurrent.next;
			tempPosition++;
		}
		return position;
	}
	//return true if list is empty
	public boolean isEmpty()
	{
		return position==-1?true:false;
	}
	//return no of elements.
	public int size()
	{
		return position+1;
	}
	//data to be added.adds data to the end of list.
	public void append(T data)
	{
		add(data);
	}
	//elements whose position isto be found out return position of the element.
	public int index(T data)
	{
		if(position==-1)
		{
			return -1;
		}
		MyNode<T> tempCurrent=head;
		int tempPosition=0;
		while(tempCurrent.data!=data)
		{
			if(tempCurrent==current)
			{
				return -1;
			}
			tempCurrent=tempCurrent.next;
			tempPosition++;

		}
		return tempPosition;
	}
	//data inserts at particular position
	public void insert(int pos,T data)
	{
		if((pos==position+1)||(position==-1))
		{
			add(data);
		}
		else if(pos==0)
		{
			MyNode<T> tempNode=head;
			head=new MyNode <T>(data);
			head.next=tempNode;
		}
		else
		{
			MyNode<T> tempCurrent=head;
			MyNode<T> tempPrev=null;
			int tempPosition=0;
			while(tempPosition<=pos+1)
			{
				tempPrev=tempCurrent;
				tempCurrent=tempCurrent.next;
				tempPosition++;
			}

			MyNode<T> newNode = new MyNode<T>(data);
			newNode.next=tempCurrent;
			tempPrev.next=newNode;
		}
		position++;class MyNode<T>
		{
			T data; // data to be stored.
			MyNode<T> next; // ref to next node.
			MyNode(T data)
			{
				this.data=data;
				next=null;
			}
		}

	}
	//pop element at given location
	public T pop(int location)
	{
		MyNode<T> tempCurrent=head;
		MyNode<T> tempPrev=null;
		int tempPosition=0;
		position--;
		while(tempPosition!=location)
		{
			tempPrev=tempCurrent;
			tempCurrent=tempCurrent.next;
			tempPosition++;
		}
		if(tempCurrent==head)
		{
			head=head.next;
			return tempCurrent.data;
		}
		else if(tempCurrent==current)
		{
			current=tempPrev;
			tempPrev.next=tempCurrent.next;
			return tempCurrent.data;
		}
		else
		{
			tempPrev.next=tempCurrent.next;
			return tempCurrent.data;
		}
	}
	public T pop()
	{
		return pop(position);
	}
	//pop & returns last element.
	public T get(int location)
	{
		MyNode<T> tempCurrent=head;
		int tempPosition=0;class MyNode<T>
		{
			T data; // data to be stored.
			MyNode<T> next; // ref to next node.
			MyNode(T data)
			{
				this.data=data;
				next=null;
			}
		}
		while(tempPosition!=location)
		{
			tempCurrent=tempCurrent.next;
			tempPosition++;
		}
		return tempCurrent.data;
	}
	//prints all the element in list
	public void list()
	{
		MyNode<T> tempCurrent=head;
		while(tempCurrent!=null)
		{
			System.out.println(tempCurrent.data);
			tempCurrent=tempCurrent.next;
		}
	}
}

