package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.ApparelManager;

public class WindowFrame extends JFrame{
	
	ApparelManager apparelmanager;
	MenuSelection menuselection;
	ApparelAdder appareladder ;
	ApparelViewer apparelviewer;
	
	public WindowFrame(ApparelManager apparelmanager) {
		this.setSize(700,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.apparelmanager = apparelmanager;
		menuselection = new MenuSelection(this);
		appareladder  = new ApparelAdder(this);
		apparelviewer = new ApparelViewer(this, this.apparelmanager);
		
		
//		this.setupPanel(menuselection);
		this.add(menuselection);
		
		this.setVisible(true);
	}
	public  void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	} 
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public ApparelAdder getAppareladder() {
		return appareladder;
	}
	public void setAppareladder(ApparelAdder appareladder) {
		this.appareladder = appareladder;
	}
	public ApparelViewer getApparelviewer() {
		return apparelviewer;
	}
	public void setApparelviewer(ApparelViewer apparelviewer) {
		this.apparelviewer = apparelviewer;
	}
}
