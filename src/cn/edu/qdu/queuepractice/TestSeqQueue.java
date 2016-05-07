package cn.edu.qdu.queuepractice;

public class TestSeqQueue {
	public static void main(String[] args) {
		SeqQueue myQueue = new SeqQueue();
		int test[] = { 1, 3, 5, 7, 9 };
		int n = 5;
		try {
			for (int i = 0; i < n; i++) {
				myQueue.EnQueue(new Integer(test[i]));
			}
			System.out.println("元素入队列序列为： ");
			for (int i = 0; i < n; i++) {
				System.out.print(test[i] + " ");
			}
			System.out.println();

			System.out.println("当前队列头元素为： " + myQueue.QueueFront());

			System.out.println("元素队列序列为： ");
			while (myQueue.notEmpty()) {
				System.out.print(myQueue.DeQueue() + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
