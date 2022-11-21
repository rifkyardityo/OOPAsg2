public class Novel extends Media {
private int Page;


public Novel(String iD, String title, int stock, int price, String type, int page) {
	super(iD, title, stock, price, type);
	Page = page;
}


public int getPage() {
	return Page;
}


public void setPage(int page) {
	Page = page;
}


@Override
public void print() {
	System.out.printf(getID() +"|"+  getTitle() +"|"+  +getPage() +"|"+  "-"  +"|"+  getStock() +"|"+  getPrice());
	
}

}
