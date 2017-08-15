package com.concretepage.bean;

import java.beans.PropertyEditorSupport;
import com.concretepage.bean.PersonType;

public class PersonTypeEditor extends PropertyEditorSupport {
	public void setAsText(String text) {
		setValue(new PersonType(text.toUpperCase()));
	}
}
