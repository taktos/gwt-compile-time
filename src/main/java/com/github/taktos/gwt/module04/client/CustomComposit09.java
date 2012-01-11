package com.github.taktos.gwt.module04.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class CustomComposit09 extends Composite {

	private static CustomComposit09UiBinder uiBinder = GWT
			.create(CustomComposit09UiBinder.class);
	@UiField Label label;

	interface CustomComposit09UiBinder extends
			UiBinder<Widget, CustomComposit09> {
	}

	public CustomComposit09() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
