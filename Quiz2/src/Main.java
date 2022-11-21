import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
ArrayList <Media> ArrayMed= new ArrayList<>();
Scanner sc= new Scanner(System.in);
Random rand = new Random();

	
public void Menu() {
	
	int option = 0;
	do {
	System.out.println("1.View Media");	
	System.out.println("2.Add Media");	
	System.out.println("3.Delete Media");	
	System.out.println("4.Exit");	
		System.out.println(">>");
		option= sc.nextInt();
		sc.nextLine();
	
	} while (option< 1 || option >4);
	switch (option) {
		case 1:
		view();
		Menu();
			break;
		case 2:
		insert();
		Menu();
			break;
		case 3:
		delete ();
		Menu();
			break;
		default:
			System.out.println("EXIT");
			break;
	}
	

	
	
}

public void insert() {
	 String ID;
	 String Title;
	 int Stock;
	 int Price;
	 int MvRating = 0;
	 int Page = 0;
	 String type ;
	 
	 int rando = rand.nextInt(999-100)+100;
	 ID = "MD"+ rando;
	 
	 do {
		System.out.println("Input Title (5-10): ");
		Title = sc.nextLine();
	} while (Title.length()<5|| Title.length()>10);
	 
	 do {
		System.out.println("Input Stock (must greater than 0): ");
		Stock = sc.nextInt();
		sc.nextLine();
	} while (Stock < 1);
	 
	do {
		System.out.println("Price ");
		Price = sc.nextInt();
		sc.nextLine();
	} while (Price< 1000);
	 
	do {
		System.out.println("Input media novel or movie : ");
		type= sc.nextLine();
	} while (!type.equalsIgnoreCase("novel")&& !type.equalsIgnoreCase("movie"));

	
	if (type.equalsIgnoreCase("novel")) {
		do {
			System.out.println("Page Count (150-800): ");
			Page= sc.nextInt();
			sc.nextLine();
		} while (Page <150 || Page >800 );
		
		
		System.out.println("ADD SUCESS NOVEL");
	}else {
		do {
			System.out.println("Movie Rating Between 1-100 ");
			MvRating= sc.nextInt();
			sc.nextLine();
		} while (MvRating <1|| MvRating>100);
		System.out.println("ADD SUCESS MOVIE");
	
	}
	
	
	/// insert
	if (type.equalsIgnoreCase("novel")) {
		ArrayMed.add(new Novel(ID, Title, Stock, Price, type, Page));
	}else {
		ArrayMed.add(new Movie(ID, Title, Stock, Price, type, MvRating));
	}
	
}

public void view() {
	if (ArrayMed.isEmpty()) {
		System.out.println("KOSONG");
	}else {
		for (int i = 0; i < ArrayMed.size(); i++) {
			ArrayMed.get(i).print();
			System.out.println();
			
		}
	}
}

public void delete() {
	if (ArrayMed.isEmpty()) {
		System.out.println("KOSONG");
	}else {
		view();
		String ID;
		int idx=0;
		int flag =0;
		do {
			System.out.println("Input Media ID : ");
			ID= sc.nextLine();
			
			for (int i = 0; i < ArrayMed.size(); i++) {
				if (ArrayMed.get(i).getID().equals(ID)) {
				flag++;
				idx=i;
				break;
				
				}
			}
			if (flag == 0) {
				System.out.println("ID NOT FOUND");
			}
		} while (flag == 0);
		ArrayMed.remove(idx);
		System.out.println("SUCESSFULLY DELETED");
		
	
		
	}
}




















public Main () {
	Menu();
		
		
}
	public static void main(String[] args) {
		new Main();

	}

}
