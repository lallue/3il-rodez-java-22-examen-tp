package rodez.java.exam.tp.task;

import java.util.*;

public class TaskControlleur {
	private List<Task> taskList;

	public TaskControlleur() {
		taskList =  new ArrayList<>();
	}
	
	public void addTask(Task task) {
		taskList.add(task);
	}
	

}
