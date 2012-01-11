package com.github.taktos.gwt.module04.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class CustomComposit07 extends Composite {

	private static CustomComposit07UiBinder uiBinder = GWT
			.create(CustomComposit07UiBinder.class);
	@UiField Label label;

	interface CustomComposit07UiBinder extends
			UiBinder<Widget, CustomComposit07> {
	}

	public CustomComposit07() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
