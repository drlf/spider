package dwcs

/**
 * ��������Ŀ��ʽ��������Ŀ�µ�task�ǿ��Ա���ȡ��
 * @author Administrator
 *
 */
class Project {
	
	TaskOwner owner
	String name
	Date createTime
	int priority
	TaskType type
    static constraints = {
    }
}
