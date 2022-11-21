
public abstract class Media {
private String ID;
private String Title;
private int Stock;
private int Price;
private String Type;





public Media(String iD, String title, int stock, int price, String type) {
	super();
	ID = iD;
	Title = title;
	Stock = stock;
	Price = price;
	Type = type;
}





public String getID() {
	return ID;
}





public void setID(String iD) {
	ID = iD;
}





public String getTitle() {
	return Title;
}





public void setTitle(String title) {
	Title = title;
}





public int getStock() {
	return Stock;
}





public void setStock(int stock) {
	Stock = stock;
}





public int getPrice() {
	return Price;
}





public void setPrice(int price) {
	Price = price;
}





public String getType() {
	return Type;
}





public void setType(String type) {
	Type = type;
}





public abstract void print();
}