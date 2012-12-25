package com.danielsiwiec;

public class HtmlFileVisitor implements DocumentElementVisitor{
	
	private StringBuilder builder = new StringBuilder("<html><body>");

	@Override
	public void visit(ElementList elementList) {
		builder.append("<ul>");
		for (DocumentElement element : elementList.getElements()){
			builder.append("<li>");
			element.accept(this);
			builder.append("</li>");
		}
		builder.append("</ul>");
	}

	@Override
	public void visit(TextElement textElement) {
		builder.append(textElement.getText());
	}

	@Override
	public String getString() {
		return builder.toString() + "</body></html>";
	}

}
