package rodez.java.exam.tp.task;

import java.util.*;

public class TaskController {
	private List<Task> taskList;

	public TaskController() {
		taskList =  new ArrayList<>();
	}
	
	public void addTask(Task task) {
		taskList.add(task);
	}
}
