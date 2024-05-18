//Done by:
//Fatimah Alsayednasser 
//Shahad Mohammed Alowfi
//Naimah Nayef Aldossary
//Noura Saad Alqahtani

package com.mycompany.taskmindergui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskMinderGUI extends JFrame implements ActionListener {
    private StackLinkedList taskStack;

    private JPanel mainPanel, createUserPanel, manageTasksPanel, createTaskPanel, showTaskPanel, showAllTasksPanel, deleteTaskPanel, deleteAllTasksPanel, sizePanel;
    private JButton createUserButton, exitButton1, exitButton2;
    private JButton createTaskButton, showTaskButton, showAllTasksButton, deleteTaskButton, deleteAllTasksButton;
    private JButton addUserButton, addTaskButton, sizeButton; 
    private JButton backButton3, backButton4, backButton5, backButton6, backButton7, backButton8, backButton9;
    private JTextField usernameField, emailField, passwordField, taskNameField, dueDateField, durationField;

    private JTextArea showTaskArea, showAllTasksArea, deleteTaskArea, deleteAllTasksArea;

    public TaskMinderGUI() {
        taskStack = new StackLinkedList();

        setTitle("Task Minder System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new CardLayout());

        mainPanel = new JPanel();
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);
    createUserButton = new JButton("Create User");
    createUserButton.setAlignmentX(Component.CENTER_ALIGNMENT); 
    mainPanel.add(createUserButton, gbc); 
    exitButton1 = new JButton("Exit");
    exitButton1.setAlignmentX(Component.CENTER_ALIGNMENT); 
    mainPanel.add(exitButton1, gbc); 
    Dimension buttonSize = new Dimension(300, 70);
    createUserButton.setPreferredSize(buttonSize);
    exitButton1.setPreferredSize(buttonSize);
    createUserButton.addActionListener(this);
    exitButton1.addActionListener(this);  
    add(mainPanel, BorderLayout.CENTER);

        createUserPanel = new JPanel();
        createUserPanel.setLayout(new GridLayout(4, 2));
        usernameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JTextField();
        addUserButton = new JButton("Add User");
        exitButton2 = new JButton("Exit");
        addUserButton.addActionListener(this);
        exitButton2.addActionListener(this);
        createUserPanel.add(new JLabel("Username:"));
        createUserPanel.add(usernameField);
        createUserPanel.add(new JLabel("Email:"));
        createUserPanel.add(emailField);
        createUserPanel.add(new JLabel("Password:"));
        createUserPanel.add(passwordField);
        createUserPanel.add(addUserButton);
        createUserPanel.add(exitButton2);
        add(createUserPanel, "CreateUserPanel");

        manageTasksPanel = new JPanel();
        manageTasksPanel.setLayout(new GridLayout(6, 1));
        createTaskButton = new JButton("Create Task");
        showTaskButton = new JButton("Show Task");
        showAllTasksButton = new JButton("Show All Tasks");
        deleteTaskButton = new JButton("Delete Task");
        deleteAllTasksButton = new JButton("Delete All Tasks");
        sizeButton = new JButton("Size"); 
        createTaskButton.addActionListener(this);
        showTaskButton.addActionListener(this);
        showAllTasksButton.addActionListener(this);
        deleteTaskButton.addActionListener(this);
        deleteAllTasksButton.addActionListener(this);
        sizeButton.addActionListener(this); 
        manageTasksPanel.add(createTaskButton);
        manageTasksPanel.add(showTaskButton);
        manageTasksPanel.add(showAllTasksButton);
        manageTasksPanel.add(deleteTaskButton);
        manageTasksPanel.add(deleteAllTasksButton);
        manageTasksPanel.add(sizeButton); 
        add(manageTasksPanel, "ManageTasksPanel");

        createTaskPanel = new JPanel();
        createTaskPanel.setLayout(new GridLayout(5, 1));
        taskNameField = new JTextField();
        dueDateField = new JTextField();
        durationField = new JTextField();
        addTaskButton = new JButton("Add Task");
        addTaskButton.addActionListener(this);
        backButton3 = new JButton("Back");
        backButton3.addActionListener(this);
        createTaskPanel.add(new JLabel("Task Name:"));
        createTaskPanel.add(taskNameField);
        createTaskPanel.add(new JLabel("Due Date:"));
        createTaskPanel.add(dueDateField);
        createTaskPanel.add(new JLabel("Duration:"));
        createTaskPanel.add(durationField);
        createTaskPanel.add(addTaskButton);
        createTaskPanel.add(backButton3);
        add(createTaskPanel, "CreateTaskPanel");

        showTaskPanel = new JPanel();
        showTaskPanel.setLayout(new BorderLayout());
        showTaskArea = new JTextArea();
        showTaskArea.setEditable(false);
        JScrollPane showTaskScrollPane = new JScrollPane(showTaskArea);
        backButton4 = new JButton("Back");
        backButton4.addActionListener(this);
        showTaskPanel.add(showTaskScrollPane, BorderLayout.CENTER);
        showTaskPanel.add(backButton4, BorderLayout.SOUTH);
        add(showTaskPanel, "ShowTaskPanel");

        showAllTasksPanel = new JPanel();
        showAllTasksPanel.setLayout(new BorderLayout());
        showAllTasksArea = new JTextArea();
        showAllTasksArea.setEditable(false);
        JScrollPane showAllTasksScrollPane = new JScrollPane(showAllTasksArea);
        backButton5 = new JButton("Back");
        backButton5.addActionListener(this);
        showAllTasksPanel.add(showAllTasksScrollPane, BorderLayout.CENTER);
        showAllTasksPanel.add(backButton5, BorderLayout.SOUTH);
        add(showAllTasksPanel, "ShowAllTasksPanel");

        deleteTaskPanel = new JPanel();
        deleteTaskPanel.setLayout(new BorderLayout());
        deleteTaskArea = new JTextArea();
        deleteTaskArea.setEditable(false);
        JScrollPane deleteTaskScrollPane = new JScrollPane(deleteTaskArea);
        backButton6 = new JButton("Back");
        backButton6.addActionListener(this);
        deleteTaskPanel.add(deleteTaskScrollPane, BorderLayout.CENTER);
        deleteTaskPanel.add(backButton6, BorderLayout.SOUTH);
        add(deleteTaskPanel, "DeleteTaskPanel");

        deleteAllTasksPanel = new JPanel();
        deleteAllTasksPanel.setLayout(new BorderLayout());
        deleteAllTasksArea = new JTextArea();
        deleteAllTasksArea.setEditable(false);
        JScrollPane deleteAllTasksScrollPane = new JScrollPane(deleteAllTasksArea);
        backButton7 = new JButton("Back");
        backButton7.addActionListener(this);
        deleteAllTasksPanel.add(deleteAllTasksScrollPane, BorderLayout.CENTER);
        deleteAllTasksPanel.add(backButton7, BorderLayout.SOUTH);
        add(deleteAllTasksPanel, "DeleteAllTasksPanel");

        sizePanel = new JPanel();
        JLabel sizeLabel = new JLabel("Number of tasks in the stack: " + taskStack.size());
        sizePanel.add(sizeLabel);
        backButton9 = new JButton("Back");
        backButton9.addActionListener(this);
        sizePanel.add(backButton9);
        add(sizePanel, "SizePanel");

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        if (e.getSource() == createUserButton) {
            cardLayout.show(getContentPane(), "CreateUserPanel");
        } else if (e.getSource() == exitButton1 || e.getSource() == exitButton2) {
            System.exit(0);
        } else if (e.getSource() == addUserButton) {
            createUser();
            cardLayout.show(getContentPane(), "ManageTasksPanel");
        } else if (e.getSource() == createTaskButton) {
            cardLayout.show(getContentPane(), "CreateTaskPanel");
        } else if (e.getSource() == addTaskButton) {
            createTask();
            JOptionPane.showMessageDialog(this, "Task added successfully!");
        } else if (e.getSource() == showTaskButton) {
            showTaskArea.setText(taskStack.Top());
            cardLayout.show(getContentPane(), "ShowTaskPanel");
        } else if (e.getSource() == showAllTasksButton) {
            showAllTasksArea.setText(taskStack.Display());
            cardLayout.show(getContentPane(), "ShowAllTasksPanel");
        } else if (e.getSource() == deleteTaskButton) {
            deleteTaskArea.setText(taskStack.Pop());
            cardLayout.show(getContentPane(), "DeleteTaskPanel");
        } else if (e.getSource() == deleteAllTasksButton) {
            deleteAllTasksArea.setText(taskStack.makeEmpty());
            cardLayout.show(getContentPane(), "DeleteAllTasksPanel");
        } else if (e.getSource() == sizeButton) {
            JLabel sizeLabel = (JLabel) sizePanel.getComponent(0);
            sizeLabel.setText("Number of tasks in the stack: " + taskStack.size());
            cardLayout.show(getContentPane(), "SizePanel");
        } else if (e.getSource() == backButton3 || e.getSource() == backButton4 ||
                   e.getSource() == backButton5 || e.getSource() == backButton6 ||
                   e.getSource() == backButton7 || e.getSource() == backButton8 ||
                   e.getSource() == backButton9) {
            cardLayout.show(getContentPane(), "ManageTasksPanel");
        }
    }

    public void createUser() {
        String username = usernameField.getText();
        String email = emailField.getText();
        int pass = Integer.parseInt(passwordField.getText());
    }

    public void createTask() {
        String taskName = taskNameField.getText();
        String dueDate = dueDateField.getText();
        int duration = Integer.parseInt(durationField.getText());
        taskStack.push(taskName, dueDate, duration);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TaskMinderGUI::new);
    }
}

class StackLinkedList {
    class Node {
        String TaskName;
        String DueDate;
        int duration;
        Node next;

        public Node(String TaskName, String DueDate, int duration) {
            this.TaskName = TaskName;
            this.DueDate = DueDate;
            this.duration = duration;
            this.next = null;
        }
    }

    Node top = null;
    int size = 0;

    StackLinkedList() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String Top() {
        if (top == null) {
            return "Stack is Empty!";
        }
        return "Top Task of Stack is: " + top.TaskName + ", Due Date:" + top.DueDate + ", Duration:" + top.duration;
    }

    public String Display() {
        if (top == null) {
            return "Stack is Empty!";
        }
        StringBuilder sb = new StringBuilder("The Tasks List:\n");
        Node temp = top;
        while (temp != null) {
            sb.append(temp.TaskName).append(", Due Date:").append(temp.DueDate).append(", Duration:").append(temp.duration).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }

    public String Pop() {
        if (isEmpty()) {
            return "Stack is Empty!";
        }
        String task = top.TaskName + ", " + top.DueDate + ", " + top.duration;
        top = top.next;
        size--;
        return task;
    }

    public String makeEmpty() {
        if (isEmpty()) {
            return "Stack Already Empty!";
        }
        while (!isEmpty()) {
            top = top.next;
            size--;
        }
        return "Stack Emptied Successfully!";
    }

    public void push(String n, String due, int d) {
        Node newNode = new Node(n, due, d);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int size() {
        return size;
    }
}
