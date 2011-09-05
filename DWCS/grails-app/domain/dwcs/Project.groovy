package dwcs

/**
 * 任务以项目形式发布，项目下的task是可以被领取的
 * @author Administrator
 *
 */
class Project {
	
	TaskOwner owner
	String name
	Date dateCreated
	int priority
	TaskType type
	//检查客户端是否准备好的代码
	String checkClientPrepare
	//客户端是准备工作（执行该任务需要下载的插件或资源）
	String clientPrepare
	
	//前提任务
	String preTask
	//任务内容
	String taskContent
	//提交任务
	String commitTask
	
	//验证task提交的结果
	String verifyTaskResult
	
	
	
    static constraints = {
    }
}
