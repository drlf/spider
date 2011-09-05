package dwcs

class Task {
	//TaskOwner owner
	Date createTime
	Project project
	//由哪个任务生成的，如果没有父任务则为空
	Task parentTask
	//是否被丢弃
	boolean isDiscard
	//前提任务
	String preTask
	//任务内容，由xml形式组成，
	String taskContent
	//
	
    static constraints = {
    }
}
