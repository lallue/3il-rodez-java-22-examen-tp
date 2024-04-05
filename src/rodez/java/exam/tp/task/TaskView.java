package rodez.java.exam.tp.task;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

public class TaskView extends JFrame{
	private JTextField titreField = new JTextField(20);
	private JTextArea descriptionArea= new JTextArea(5,20);
	private JTextField dateEcheanceField = new JTextField(20);
	
	private TaskController controller;
	
	private JButton addButton = new JButton("Ajout Tache");


	public TaskView(TaskController controller){
		this.controller = controller;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,300);	
		
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints  constaints = new GridBagConstraints();
		constaints.gridx = 0;
		constaints.gridy = 0;
		constaints.anchor = GridBagConstraints.WEST;
		
		panel.add(new JLabel("Titre"), constaints);
		
		constaints.gridy = 1;
		panel.add(new JLabel("Description"), constaints);
		
		constaints.gridy = 2;
		panel.add(new JLabel("Date echeance jour/moi/annee"), constaints);
		
		constaints.gridx = 1;
		
		constaints.gridy = 0;
		panel.add(titreField, constaints);
		
		constaints.gridy = 1;
		panel.add(descriptionArea, constaints);
		
		constaints.gridy = 2;
		panel.add(dateEcheanceField, constaints);
		
		constaints.gridy = 3;
		constaints.anchor = GridBagConstraints.CENTER;
		
		addButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    String titre = titreField.getText();
			    String description = descriptionArea.getText();
			    String date = dateEcheanceField.getText();
			    
			    Date duedate = parseDate(date);
			    
			    Task task = new Task(titre, description, duedate);

			    controller.addTask(task);
			    
			    titreField.setText("");
			    descriptionArea.setText("");
			    dateEcheanceField.setText("");
			  }
			} );
		this.add(panel);
		this.setVisible(true);
	}

	protected Date parseDate(String date) {
		
		return new Date();
	}
}
