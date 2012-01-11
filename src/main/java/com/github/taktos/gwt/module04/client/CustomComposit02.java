package com.github.taktos.gwt.module04.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class CustomComposit02 extends Composite {

	private static CustomComposit02UiBinder uiBinder = GWT
			.create(CustomComposit02UiBinder.class);
	@UiField Label label;

	interface CustomComposit02UiBinder extends
			UiBinder<Widget, CustomComposit02> {
	}

	public CustomComposit02() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
