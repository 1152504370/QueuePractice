package cn.edu.qdu.queuepractice;

public interface Queue {
	// ���
	public void EnQueue(Object obj) throws Exception;

	// ����
	public Object DeQueue() throws Exception;

	// ��ȡ����ɾ��ͷԪ��
	public Object QueueFront() throws Exception;

	// �ж϶����Ƿ�Ϊ��
	public boolean notEmpty();
}
