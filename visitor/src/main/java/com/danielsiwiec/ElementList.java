package com.danielsiwiec;

import java.util.Arrays;
import java.util.List;

public class ElementList implements DocumentElement{
	
	private List<DocumentElement> elements;
	
	public ElementList(DocumentElement... elements){
		this.elements = Arrays.asList(elements);
	}

	@Override
	public void accept(DocumentElementVisitor visitor) {
		visitor.visit(this);
	}

	public List<DocumentElement> getElements() {
		return elements;
	}

}
