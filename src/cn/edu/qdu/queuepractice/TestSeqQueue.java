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
			System.out.println("Ԫ�����������Ϊ�� ");
			for (int i = 0; i < n; i++) {
				System.out.print(test[i] + " ");
			}
			System.out.println();

			System.out.println("��ǰ����ͷԪ��Ϊ�� " + myQueue.QueueFront());

			System.out.println("Ԫ�ض�������Ϊ�� ");
			while (myQueue.notEmpty()) {
				System.out.print(myQueue.DeQueue() + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
