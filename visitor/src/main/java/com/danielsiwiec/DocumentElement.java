package com.danielsiwiec;

public interface DocumentElement {
	
	public void accept(DocumentElementVisitor visitor);

}
