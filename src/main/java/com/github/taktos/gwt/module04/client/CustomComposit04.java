package com.github.taktos.gwt.module04.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class CustomComposit04 extends Composite {

	private static CustomComposit04UiBinder uiBinder = GWT
			.create(CustomComposit04UiBinder.class);
	@UiField Label label;

	interface CustomComposit04UiBinder extends
			UiBinder<Widget, CustomComposit04> {
	}

	public CustomComposit04() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
