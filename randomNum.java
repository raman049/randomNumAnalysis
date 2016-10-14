
/**
*
* @author  Raman Maharjan
* @version 1.0
* @since   2016-10-14 
*/
package iioo121;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class randomNum {

	public randomNum() {
		// TODO Auto-generated constructor stub
		ranFrame aa = new ranFrame();
		aa.show();
	}

	public class ranFrame extends JFrame {

		public ranFrame() {
			setResizable(false);
			setVisible(true);
			setSize(500, 400);
			setTitle("Random Number Analysis");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			Container container = getContentPane();
			ranPanel jpanel = new ranPanel();
			container.add(jpanel);
			getContentPane().add(jpanel);
		}
	}

	JTextField inputRandomTF, numRandomTF, desireRandomTF, outputCountTF, randomNum;
	JLabel inputRandomTL, numRandomTL, desireRandomTL, outputCountTL;
	JButton actionB, actionReset;
	int i = 0;
	int c = 0;
	int a = 0;
	String random = "";

	public class ranPanel extends JPanel implements ActionListener {

		public ranPanel() {
			inputRandomTF = new JTextField(10);
			numRandomTF = new JTextField(10);
			desireRandomTF = new JTextField(10);
			outputCountTF = new JTextField(10);
			randomNum = new JTextField(25);
			numRandomTL = new JLabel("How many random numbers to be generated:            ");
			inputRandomTL = new JLabel("Enter a number to generate number between 0 and __: ");
			desireRandomTL = new JLabel("Enter a desired number to be counted:               ");
			outputCountTL = new JLabel("Total number of output: ");
			actionB = new JButton("    Enter    ");
			actionReset = new JButton("    Reset    ");
			JPanel panel = new JPanel();
			panel.add(numRandomTL);
			panel.add(numRandomTF);
			panel.add(inputRandomTL);
			panel.add(inputRandomTF);
			panel.add(desireRandomTL);
			panel.add(desireRandomTF);
			panel.add(actionB);
			panel.add(randomNum);
			panel.add(outputCountTL);
			panel.add(outputCountTF);
			panel.setLayout(new FlowLayout(10));
			setLayout(new BorderLayout());
			add(panel, BorderLayout.CENTER);

			actionB.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					process p = new process();
				}
			});

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		}
	}

	public static void main(String args[]) {
		randomNum aaa = new randomNum();

	}

	public class process {
		public process() {
			while (i < Integer.parseInt((numRandomTF.getText()))) {
				a = (int) (Math.random() * (Integer.parseInt(inputRandomTF.getText()) + 1));
				System.out.print(a + ",");
				random = Integer.toString(a) + "," + random;
				i++;
				if (a == Integer.parseInt(desireRandomTF.getText()))
					c = c + 1;
			}
			randomNum.setText(random);
			outputCountTF.setText(Integer.toString(c));
			outputCountTL.setText("Number of times " + desireRandomTF.getText() + " appears: ");
			System.out.println("");
			System.out.print("Number of times " + desireRandomTF.getText() + " appears: " + c);
		}
	}
}
