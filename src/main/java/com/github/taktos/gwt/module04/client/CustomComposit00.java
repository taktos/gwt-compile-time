package com.github.taktos.gwt.module04.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class CustomComposit00 extends Composite {

	private static CustomComposit00UiBinder uiBinder = GWT
			.create(CustomComposit00UiBinder.class);
	@UiField Label label;

	interface CustomComposit00UiBinder extends
			UiBinder<Widget, CustomComposit00> {
	}

	public CustomComposit00() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
