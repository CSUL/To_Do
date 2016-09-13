

public class ToDo {

	String task;
	String date;
	boolean complete;
	String completedDate;
	
	public ToDo()
	{
	}
	
	public ToDo(String task, String date)
	{
		this.task=task;
		this.date=date;
		complete = false;
		completedDate = null;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setComplete(boolean status) {
		this.complete = status;
	}
	
	public boolean getComplete() {
		return complete;
	}
	
	public void setCompletedDate(String date){
		this.completedDate = date;
	}
	
	public String  getCompletedDate(){
		return this.completedDate;
	}
}
