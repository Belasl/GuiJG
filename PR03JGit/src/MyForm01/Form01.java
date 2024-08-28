package MyForm01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


	
	public class Form01 extends JFrame {
		private JButton button = new JButton("Press"); // кнопка
		private JTextField input = new JTextField(""); //поле ввода 1 
		private JTextField input1 = new JTextField(""); //поле ввода 2
		private JLabel label = new JLabel("Введите а: "); //надпись для поля 1
		private JLabel label1 = new JLabel("Введите b: "); //надпись для поля 2
		
	public Form01() {
		super ("Расчет суммы");
		this.setBounds(100,100,300,150); //где находится в экране и размеры высота и ширина
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // выход при закрытии формы
		
		
		Container container = this.getContentPane(); //создание контейнера формы
		container.setLayout(new GridLayout(3, 2, 2, 2)); //табличная разметка контейнера
		container.add(label); //добавление надписи поля 1
		container.add(input); //добавление поля 1
		container.add(label1);//добавление надписи поля 2
		container.add(input1);	//добавление поля 2
		
		//Работа с кнопкой Press
				button.addActionListener(new ButtonEventListener()); //вызываем процедуру событий кнопки
				container.add(button);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String massege="";
			massege +="Кнопка нажата \n"; 
			massege +="Данные из поля 1: "+ input.getText() +"\n"; //текст из поля ввода input, с новой строки
			massege +="Данные из поля 2: "+ input1.getText() +"\n";
			int s =  Integer.parseInt(input.getText())+ Integer.parseInt(input1.getText());	
			massege +="Результат: " + s + "\n"; 
			JOptionPane.showMessageDialog(null, massege, "Вывод",JOptionPane.PLAIN_MESSAGE); // вывод сообщения
			}
		}
	
}
