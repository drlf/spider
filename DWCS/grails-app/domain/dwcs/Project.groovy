package dwcs

/**
 * 任务以项目形式发布，项目下的task是可以被领取的
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
