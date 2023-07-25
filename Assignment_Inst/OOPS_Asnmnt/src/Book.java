import java.util.Scanner;

public class Book {
    int Bookid;
    int price;
    int pages;

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter book details :-");
        Bookid = sc.nextInt();
        price = sc.nextInt();
        pages = sc.nextInt();
    }

    void show() {
        System.out.println();
        System.out.println("Book id    : "+Bookid);
        System.out.println("Book price : "+price);
        System.out.println("Book pages : "+pages);
    }

    void set(int Bookid, int price, int pages) {
        this.Bookid = Bookid;
        this.price = price;
        this.pages = pages;
    }

    int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Book b1 =  new Book();
        b1.get();
        b1.show();

        Book b2 = new Book();
        b2.set(1254,500,169);
        b2.show();

        if (b1.getPrice() > b2.getPrice()) {
            b1.show();
        } else {
            b2.show();
        }
    }
}
