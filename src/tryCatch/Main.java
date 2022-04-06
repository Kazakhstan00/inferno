package tryCatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library lib = new Library();

        int books =1;
        while (true) {
            System.out.println("PRESS 1 - Add book");
            System.out.println("PRESS 2 - List Library");
            System.out.println("PRESS 0 - Exit");
            int a = in.nextInt();
            if (a == 1) {
                System.out.println("Write book name");
                String name = in.next();
                System.out.println("Write book author");
                String author = in.next();
                Book book = new Book(books, name, author);
                lib.addBook(book);
                books++;
            } else if (a == 2) {
                lib.printBooks();
            }
            else if(a==0){
                break;
            }
        }

    }
}