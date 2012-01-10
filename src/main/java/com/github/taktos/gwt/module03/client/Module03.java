/**
 *
 */
package com.github.taktos.gwt.module03.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Only use gwt standard widgets.
 * @author taktos
 *
 */
public class Module03 implements EntryPoint {

	/* (非 Javadoc)
	 * @see com.google.gwt.core.client.EntryPoint#onModuleLoad()
	 */
	public void onModuleLoad() {
		VerticalPanel panel = new VerticalPanel();
		panel.add(new CustomLabel0());
		panel.add(new CustomLabel1());
		panel.add(new CustomLabel2());
		panel.add(new CustomLabel3());
		panel.add(new CustomLabel4());
		panel.add(new CustomLabel5());
		panel.add(new CustomLabel6());
		panel.add(new CustomLabel7());
		panel.add(new CustomLabel8());
		panel.add(new CustomLabel9());
		RootPanel.get().add(panel);
	}

}
