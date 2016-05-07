package cn.edu.qdu.queuepractice;

public interface Queue {
	// 入队
	public void EnQueue(Object obj) throws Exception;

	// 出队
	public Object DeQueue() throws Exception;

	// 获取但不删除头元素
	public Object QueueFront() throws Exception;

	// 判断队列是否为空
	public boolean notEmpty();
}
