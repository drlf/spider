package dwcs

/**
 * ��������Ŀ��ʽ��������Ŀ�µ�task�ǿ��Ա���ȡ��
 * @author Administrator
 *
 */
class Project {
	
	TaskOwner owner
	String name
	Date dateCreated
	int priority
	TaskType type
	//���ͻ����Ƿ�׼���õĴ���
	String checkClientPrepare
	//�ͻ�����׼��������ִ�и�������Ҫ���صĲ������Դ��
	String clientPrepare
	
	//ǰ������
	String preTask
	//��������
	String taskContent
	//�ύ����
	String commitTask
	
	//��֤task�ύ�Ľ��
	String verifyTaskResult
	
	
	
    static constraints = {
    }
}
