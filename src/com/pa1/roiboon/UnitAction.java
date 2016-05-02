/**
 * @author Roiboon Chaiyachit
 * */

package com.pa1.roiboon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitAction implements ActionListener {

	private Unit[] unit;
	
	/**
	 * @param unit such as Length,Area etc
	 * */
	public UnitAction(Unit[] unit) {
		this.unit = unit;
	}


	/**Reinit unit in the both side comboBox depend on Unit type 
	 * @param e not use.
	 * */
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
