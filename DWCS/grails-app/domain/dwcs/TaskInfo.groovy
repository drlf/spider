package dwcs

import java.util.Date;

/**
 * ������ȡ��ִ�����
 * һ������ֻ�ܶ�Ӧһ����Ч��TaskInfo����isDiscardΪfalse
 * @author Administrator
 *
 */
class TaskInfo {
	Task task
	TaskOwner taskOwner
	Worker worker
	Date retrieveTime
	//�Ƿ���ȡ
	boolean isRetrieved
	//�Ƿ��ύ
	boolean isCommitted
	//�ύ��������ͨ����֤����֤����Ϊ��Ч��ɣ��������·���������	
	boolean done
	//�������ϣ���֤��ͨ��ʱ��
	boolean isDiscard
    static constraints = {
    }
}
