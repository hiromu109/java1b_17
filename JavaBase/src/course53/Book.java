package course53;

public class Book {
	private String title;
	private int price;

	public Book() {
		System.out.println("動いたよ。");
	}

	public Book(String userInputTitle) {
		this.title = userInputTitle;
		System.out.println("タイトルに初期値として" + userInputTitle + "をセットしました。");
	}

	//練習問題①
	public Book(String userInputTitle, int userInputPrice) {
		System.out.println("タイトルに初期値として" + userInputTitle + "をセットしました。");
		System.out.println("タイトルに価格として" + userInputPrice + "をセットしました。");
	}

	//ここにタイトルと価格をセットするコンストラクタを書いてみよう////
	//////////////////////////////////////////////////////////////////
	////////////////以下getter及びsetter(今日は無視してOK）/////////////
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	////////////////以下getter及びsetter(今日は無視してOK）/////////////
}