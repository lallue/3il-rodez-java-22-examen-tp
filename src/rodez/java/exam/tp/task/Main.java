package rodez.java.exam.tp.task;

public class Main {
	public static void main(String[] args) {
		TaskController conttroller = new TaskController();
		new TaskView(conttroller);
	}
}
