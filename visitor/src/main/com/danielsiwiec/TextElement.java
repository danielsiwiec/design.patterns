package com.danielsiwiec;

public class TextElement implements DocumentElement{
	
	private String text;

	public TextElement(String text){
		this.text = text;
	}

	@Override
	public void accept(DocumentElementVisitor visitor) {
		visitor.visit(this);
	}

	public String getText() {
		return text;
	}

}
