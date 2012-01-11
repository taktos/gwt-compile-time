/**
 *
 */
package com.github.taktos.gwt.module04.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Only use gwt standard widgets.
 * @author taktos
 *
 */
public class Module04 implements EntryPoint {

	/* (非 Javadoc)
	 * @see com.google.gwt.core.client.EntryPoint#onModuleLoad()
	 */
	public void onModuleLoad() {
		VerticalPanel panel = new VerticalPanel();
		panel.add(new CustomComposit00());
		panel.add(new CustomComposit01());
		panel.add(new CustomComposit02());
		panel.add(new CustomComposit03());
		panel.add(new CustomComposit04());
		panel.add(new CustomComposit05());
		panel.add(new CustomComposit06());
		panel.add(new CustomComposit07());
		panel.add(new CustomComposit08());
		panel.add(new CustomComposit09());
		RootPanel.get().add(panel);
	}

}
