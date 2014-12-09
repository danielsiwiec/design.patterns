package com.danielsiwiec;

public class RunVisitor {
	
	public static void main(String[] args){
		TextElement textElement1 = new TextElement("First item");
		TextElement textElement2 = new TextElement("Second element", TextStyle.BOLD);
		ElementList list = new ElementList(textElement1, textElement2);
		
		System.out.println("TextFileVisitor output: \n");
		TextFileVisitor textFileVisitor = new TextFileVisitor();
		list.accept(textFileVisitor);
		System.out.println(textFileVisitor.getString());
		
		System.out.println("HtmlFileVisitor output: \n");
		HtmlFileVisitor htmlFileVisitor = new HtmlFileVisitor();
		list.accept(htmlFileVisitor);
		System.out.println(htmlFileVisitor.getString());
	}

}
