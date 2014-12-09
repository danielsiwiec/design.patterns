package com.danielsiwiec;

public class TextFileVisitor implements DocumentElementVisitor{

	private StringBuilder builder = new StringBuilder();
	
	@Override
	public void visit(ElementList elementList) {
		for (DocumentElement element : elementList.getElements()){
			builder.append("*");
			element.accept(this);
			builder.append("\n");
		}
	}

	@Override
	public void visit(TextElement textElement) {
		builder.append(textElement.getStyle() == TextStyle.BOLD ? 
				textElement.getText().toUpperCase() : textElement.getText());
	}

	@Override
	public String getString() {
		return builder.toString();
	}

}
