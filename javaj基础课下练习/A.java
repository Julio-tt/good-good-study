package cjqc;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class A extends JFrame {

	Button red = new Button("ºì");

	Button green = new Button("ÂÌ");

	Button blue = new Button("À¶");

	TextField text = new TextField();

	A()

	{

		super("¸Ä±äÑÕÉ«");

		setBounds(150, 190, 300, 200);

		setLayout(null);

		red.setBounds(25, 50, 50, 20);

		add(red);

		green.setBounds(125, 50, 50, 20);

		add(green);

		blue.setBounds(225, 50, 50, 20);

		add(blue);

		text.setBounds(25, 100, 250, 30);

		add(text);

		red.addActionListener(new ActionListener()

		{

			public void actionPerformed(ActionEvent e)

			{

				text.setBackground(Color.red);

			}

		});

		green.addActionListener(new ActionListener()

		{

			public void actionPerformed(ActionEvent e)

			{

				text.setBackground(Color.green);

			}

		});

		blue.addActionListener(new ActionListener()

		{

			public void actionPerformed(ActionEvent e)

			{

				text.setBackground(Color.blue);

			}

		});

		setDefaultCloseOperation(3);

		setVisible(true);

	}

	public static void main(String[] args)

	{

		new A();

	}

}
