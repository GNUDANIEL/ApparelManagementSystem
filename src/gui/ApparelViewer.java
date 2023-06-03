package gui;

import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ApparelViewer extends JFrame{
	public ApparelViewer() {
		// TODO Auto-generated constructor stub
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("name");
		model.addColumn("gender");
		model.addColumn("size");
		model.addColumn("number");
		model.addColumn("location");
		model.addColumn("stock");
		model.addColumn("color");
		model.addColumn("price");
		model.addColumn("season");
		
		JTable table= new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
