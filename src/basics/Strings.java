package basics;

public class Strings {

	public static void main(String[] args) {
		String wordCcoice="Lord";
		String bookTitle="Charlie Chaplin was a Lord";
		if(bookTitle.contains(wordCcoice)) {
			System.out.println("The book is crazy");
		}
		String browser="chrome";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("The browser is chrome");
		}

	}

}
