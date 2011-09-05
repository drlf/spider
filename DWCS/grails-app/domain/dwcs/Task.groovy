package dwcs

class Task {
	//TaskOwner owner
	Date dateCreated
	Project project
	//由哪个任务生成的，如果没有父任务则为空
	Task parentTask
	//是否被丢弃
	boolean isDiscard
	//前提任务,如果为空，则采用project的同名项的值
	String preTask
	//任务内容，由xml形式组成，,如果为空，则采用project的同名项的值
	String taskContent
	//提交任务,如果为空，则采用project的同名项的值
	String commitTask
	
    static constraints = {
    }
}
