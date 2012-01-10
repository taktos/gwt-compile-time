/**
 *
 */
package com.github.taktos.gwt.module01.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Only use gwt standard widgets.
 * @author taktos
 *
 */
public class Module01 implements EntryPoint {

	/* (非 Javadoc)
	 * @see com.google.gwt.core.client.EntryPoint#onModuleLoad()
	 */
	public void onModuleLoad() {
		VerticalPanel panel = new VerticalPanel();
		panel.add(new Label("0"));
		panel.add(new Label("1"));
		panel.add(new Label("2"));
		panel.add(new Label("3"));
		panel.add(new Label("4"));
		panel.add(new Label("5"));
		panel.add(new Label("6"));
		panel.add(new Label("7"));
		panel.add(new Label("8"));
		panel.add(new Label("9"));
		RootPanel.get().add(panel);
	}

}
