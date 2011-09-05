package dwcs

import java.util.Date;

/**
 * 任务领取和执行情况
 * 一个任务只能对应一个有效的TaskInfo，即isDiscard为false
 * @author Administrator
 *
 */
class TaskInfo {
	Task task
	TaskOwner taskOwner
	Worker worker
	Date retrieveTime
	//是否领取
	boolean isRetrieved
	//是否提交
	boolean isCommitted
	//提交任务有无通过验证，验证过是为有效完成，否则重新发布该任务。	
	boolean done
	//任务作废（验证不通过时）
	boolean isDiscard
    static constraints = {
    }
}
