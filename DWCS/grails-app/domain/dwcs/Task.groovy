package dwcs

class Task {
	//TaskOwner owner
	Date createTime
	Project project
	//���ĸ��������ɵģ����û�и�������Ϊ��
	Task parentTask
	//�Ƿ񱻶���
	boolean isDiscard
	//ǰ������
	String preTask
	//�������ݣ���xml��ʽ��ɣ�
	String taskContent
	//
	
    static constraints = {
    }
}
