package cn.edu.qdu.queuepractice;

public class SeqQueue implements Queue {
	final int defaultSize = 10;
	int end;
	Object[] queue;
	int maxQueueSize;

	public SeqQueue() {
		inititiate(defaultSize);
	}

	public SeqQueue(int sz) {
		inititiate(sz);
	}

	public void inititiate(int sz) {
		maxQueueSize = sz;
		end = 0;
		queue = new Object[sz];
	}

	public void EnQueue(Object obj) throws Exception {
		if (end == maxQueueSize) {
			throw new Exception("队列已满！");
		}
		queue[end] = obj;
		end++;

	}

	public Object DeQueue() throws Exception {
		if (end == 0) {
			throw new Exception("队列已空！");
		}
		Object a = queue[0];
		for (int i = 0; i < end - 1; i++) {
			queue[i] = queue[i + 1];
		}
		end--;
		return a;
	}

	@Override
	public Object QueueFront() throws Exception {
		if (end == 0) {
			throw new Exception("队列已空！");
		}

		return queue[0];
	}

	@Override
	public boolean notEmpty() {
		return (end > 0);
	}

}
