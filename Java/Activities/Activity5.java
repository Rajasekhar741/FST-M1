package activities;

abstract class Book{
	String title;
	
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	public void setTitle(String s) {
		title = s;
	}
}

public class Activity5 {
	
public static void main(String[] args) {
	Book novel = new MyBook();
	String title ="Harry Potter";
	novel.setTitle(title);
	System.out.println("Title of book: " + novel.getTitle());
}
	
	

}
