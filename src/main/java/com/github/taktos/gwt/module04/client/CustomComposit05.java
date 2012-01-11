package com.github.taktos.gwt.module04.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class CustomComposit05 extends Composite {

	private static CustomComposit05UiBinder uiBinder = GWT
			.create(CustomComposit05UiBinder.class);
	@UiField Label label;

	interface CustomComposit05UiBinder extends
			UiBinder<Widget, CustomComposit05> {
	}

	public CustomComposit05() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
