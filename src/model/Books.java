package model;

public class Books implements Comparable<Books>{
	
	private int book_id;
	private String book_name;
	private int book_price;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
	public Books(int book_id, String book_name, int book_price) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_price = book_price;
	}
	
	public Books() {
		super();
	}
	
	@Override
	public String toString() {
		return "Books [book_id=" + book_id + ", book_name=" + book_name + ", book_price=" + book_price + "]";
	}

	
	@Override
	public int compareTo(Books o) {
		
		if (getBook_price() == o.getBook_price()) {
			return o.getBook_name().compareTo(getBook_name());
		} else {
			if (o.book_price<book_price) {
				return 1;
			} else {
				return -1;
			}

		}
	}
	
	
	
	
}
