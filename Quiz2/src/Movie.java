
public class Movie extends Media {
private int MvRating;



public Movie(String iD, String title, int stock, int price, String type, int mvRating) {
	super(iD, title, stock, price, type);
	MvRating = mvRating;
}



public int getMvRating() {
	return MvRating;
}



public void setMvRating(int mvRating) {
	MvRating = mvRating;
}



@Override
public void print() {
	System.out.printf(getID() +"|"+  getTitle() +"|"+  "-"+  "|"+  getMvRating()  +"|"+  getStock() +"|"+  getPrice());
	
}

}
