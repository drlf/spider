package dwcs

class Task {
	//TaskOwner owner
	Date dateCreated
	Project project
	//���ĸ��������ɵģ����û�и�������Ϊ��
	Task parentTask
	//�Ƿ񱻶���
	boolean isDiscard
	//ǰ������,���Ϊ�գ������project��ͬ�����ֵ
	String preTask
	//�������ݣ���xml��ʽ��ɣ�,���Ϊ�գ������project��ͬ�����ֵ
	String taskContent
	//�ύ����,���Ϊ�գ������project��ͬ�����ֵ
	String commitTask
	
    static constraints = {
    }
}
