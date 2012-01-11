package com.github.taktos.gwt.module04.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class CustomComposit08 extends Composite {

	private static CustomComposit08UiBinder uiBinder = GWT
			.create(CustomComposit08UiBinder.class);
	@UiField Label label;

	interface CustomComposit08UiBinder extends
			UiBinder<Widget, CustomComposit08> {
	}

	public CustomComposit08() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
