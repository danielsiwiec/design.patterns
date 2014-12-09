package com.danielsiwiec;

public class TextElement implements DocumentElement{
	
	private final String text;
	private final TextStyle style;

	public TextElement(String text){
		this(text,TextStyle.NORMAL);
	}
	
	public TextElement(String text, TextStyle style){
		this.text = text;
		this.style = style;
	}

	@Override
	public void accept(DocumentElementVisitor visitor) {
		visitor.visit(this);
	}

	public String getText() {
		return text;
	}
	
	
	public TextStyle getStyle(){
		return style;
	}

}
