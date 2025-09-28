package com.collectionQueue;

public class QueueAddValueUsingArray {
	public static void main(String[] args) {

		queueadd q = new queueadd();
//		q.enque(10);
//		q.enque(20);
//		q.enque(40);
//		q.enque(80);
		q.enque(60);
        q.enque(4);
		
		

//		q.show();
		q.deque();
//		q.deque();
		q.show();

	}

}

class queueadd {
	
	int queue[] = new int[5];
	int front;
	int size;
	int rear;

	public void enque(int element) {
		if(size!=5) {
			
		queue[rear] = element;
		rear = rear + 1;
		size = size + 1;
		}
		else{
			 System.out.println("que is full");
		}

	}

	public int deque() {
		
		int element = queue[front];
		if(size>0) {
		front++;
		size--;
		}
		else {
			System.out.println("que is empty");
		}
		return element;

	}

	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.print(queue[front + i] + " ");
		}
	}

}
