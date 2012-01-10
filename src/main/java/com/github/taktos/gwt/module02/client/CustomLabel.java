package com.github.taktos.gwt.module02.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.i18n.shared.DirectionEstimator;
import com.google.gwt.user.client.ui.Label;

/**
 * Custom label widget
 * @author takiguchi
 *
 */
public class CustomLabel extends Label {

	public CustomLabel() {
		super();
	}

	public CustomLabel(Element element) {
		super(element);
	}

	public CustomLabel(String text, boolean wordWrap) {
		super(text, wordWrap);
	}

	public CustomLabel(String text, Direction dir) {
		super(text, dir);
	}

	public CustomLabel(String text, DirectionEstimator directionEstimator) {
		super(text, directionEstimator);
	}

	public CustomLabel(String text) {
		super(text);
	}

}
