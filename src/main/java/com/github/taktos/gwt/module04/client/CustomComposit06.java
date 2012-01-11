package com.github.taktos.gwt.module04.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class CustomComposit06 extends Composite {

	private static CustomComposit06UiBinder uiBinder = GWT
			.create(CustomComposit06UiBinder.class);
	@UiField Label label;

	interface CustomComposit06UiBinder extends
			UiBinder<Widget, CustomComposit06> {
	}

	public CustomComposit06() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
