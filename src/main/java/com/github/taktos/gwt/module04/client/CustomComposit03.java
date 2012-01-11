package com.github.taktos.gwt.module04.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class CustomComposit03 extends Composite {

	private static CustomComposit03UiBinder uiBinder = GWT
			.create(CustomComposit03UiBinder.class);
	@UiField Label label;

	interface CustomComposit03UiBinder extends
			UiBinder<Widget, CustomComposit03> {
	}

	public CustomComposit03() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
