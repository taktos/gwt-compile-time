/**
 *
 */
package com.github.taktos.gwt.module02.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Use a custom label widget.
 * @author taktos
 *
 */
public class Module02 implements EntryPoint {

	/* (非 Javadoc)
	 * @see com.google.gwt.core.client.EntryPoint#onModuleLoad()
	 */
	public void onModuleLoad() {
		VerticalPanel panel = new VerticalPanel();
		panel.add(new CustomLabel("0"));
		panel.add(new CustomLabel("1"));
		panel.add(new CustomLabel("2"));
		panel.add(new CustomLabel("3"));
		panel.add(new CustomLabel("4"));
		panel.add(new CustomLabel("5"));
		panel.add(new CustomLabel("6"));
		panel.add(new CustomLabel("7"));
		panel.add(new CustomLabel("8"));
		panel.add(new CustomLabel("9"));
		RootPanel.get().add(panel);
	}

}
