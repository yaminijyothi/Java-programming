package com.bridgelabz.DatastructurePrograms.CashCounter;

public class MyQueue {
	//declaring a array queue to strore elements
	int queue[]=new int[5];
	int size;
	int front;
	int rear;
	//to add
	public void enQueue(int data) {
		queue[rear]=data;
		rear++;
		size++;
	}
	//display method
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.println(queue[front+i]+" ");
		}
	}
	//to remove
	public void deQueue() {
		int data=queue[front];
		front++;
		size--;

	}
}
