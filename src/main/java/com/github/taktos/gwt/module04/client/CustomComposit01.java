package com.github.taktos.gwt.module04.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class CustomComposit01 extends Composite {

	private static CustomComposit01UiBinder uiBinder = GWT
			.create(CustomComposit01UiBinder.class);
	@UiField Label label;

	interface CustomComposit01UiBinder extends
			UiBinder<Widget, CustomComposit01> {
	}

	public CustomComposit01() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
