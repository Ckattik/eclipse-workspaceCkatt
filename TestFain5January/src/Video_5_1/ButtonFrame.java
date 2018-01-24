package Video_5_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonFrame extends JFrame {

	private static final int DEFAULT_HEIGHT = 300;
	private static final int DEFAULT_WIDTH = 200;

	public ButtonFrame() {
		this.setTitle("ButtonTest");
		this.setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
//		Создание кнопок
		JButton yellowButton = new JButton("Yellow");
		JButton blueButton = new JButton("Blue");
		JButton redButton = new JButton("Red");
		
		JPanel buttonPanel = new JPanel();
		
//		Добавление кнорпок к панели
		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);
		
//		Добавление панели к фрейму
		
		add(buttonPanel);
		
//		Создание действий кнопок
		ColorAction yellowAction = new ColorAction(Color.YELLOW);
		ColorAction blueAction = new ColorAction(Color.BLUE);
		ColorAction redAction = new ColorAction(Color.RED);
		
		
		
//		Связание действий с кнопками
		yellowButton.addActionListener(yellowAction);
		blueButton.addActionListener(blueAction);
		redButton.addActionListener(redAction);
	}
	
//	Слушатель действия изменяющий цвет панели 
	
	private class ColorAction implements ActionListener{

		private Color backgroundColor;
        private JPanel buttonPanel;

		public ColorAction(Color c) {
		      backgroundColor = c;
		}
		
		
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		buttonPanel.setBackground(backgroundColor);
		
	}
		
	}
	
}
