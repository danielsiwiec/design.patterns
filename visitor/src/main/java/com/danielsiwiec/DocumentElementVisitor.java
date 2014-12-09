package com.danielsiwiec;

public interface DocumentElementVisitor {

	public void visit(ElementList elementList);

	public void visit(TextElement textElement);
	
	public String getString();

}
