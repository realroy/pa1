package com.pa1.roiboon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitAction implements ActionListener {

	private Unit[] unit;
	
	public UnitAction(Unit[] unit) {
		this.unit = unit;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		App.leftComboBox.removeAllItems();
		App.rightComboBox.removeAllItems();
		for(Unit n : unit){
			App.leftComboBox.addItem(n);
			App.rightComboBox.addItem(n);
		}
		
		
	}

}
