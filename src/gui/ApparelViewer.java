package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import apparel.ApparelInput;
import manager.ApparelManager;

public class ApparelViewer extends JPanel{
	WindowFrame frame ;
	ApparelManager apparelmanager;
	
	public ApparelViewer(WindowFrame frame, ApparelManager apparelmanager) {
		this.frame = frame;
		this.apparelmanager = apparelmanager;
		
		System.out.println("***" + apparelmanager.size() + "***");
		
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
		
		for (int i = 0; i < apparelmanager.size(); i++) {
			Vector row  = new Vector();
			ApparelInput ai = apparelmanager.get(i);
			row.add(ai.getName());
			row.add(ai.getProductNumber());
			row.add(ai.getLocation());
			model.addRow(row);
		}
		
		JTable table= new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);		
	}
	
}
