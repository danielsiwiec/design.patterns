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
		boolean isBold = textElement.getStyle() == TextStyle.BOLD;
		if (isBold) builder.append("<b>");
		builder.append(textElement.getText());
		if (isBold) builder.append("</b>");
	}

	@Override
	public String getString() {
		return builder.toString() + "</body></html>";
	}

}
