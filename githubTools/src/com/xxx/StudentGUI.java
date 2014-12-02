package com.xxx;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class StudentGUI {
	public List<Student> getList(){
		List<Student> list=new ArrayList<Student>();
		for(int i=0;i<5;i++){
			Student s=new Student();
			s.setAddress("baidu"+(i+1));
			s.setId((i+1));
			s.setName("xxx"+(i+1));
			list.add(s);
		}
		return list;
	}
	public void show(){
		JFrame frame=new JFrame("User by xxx");
		JPanel panel=new JPanel();
		JTextArea textArea=new JTextArea();
		panel.add(textArea);
		List<Student> list=getList();
		for(int i=0;i<list.size();i++){
			textArea.append(list.get(i).toString()+"\r\n");
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setBounds(400, 400, 400, 400);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("made by xxx");
		new StudentGUI().show();
	}
}
