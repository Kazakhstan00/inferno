package tryCatch;

public class Library {
    String name;
    String city;
    Book books[] = new Book[5];
    int index = 0;

    public Library(){
    }
    public Library(String name, String city, Book[] books, int index){
        this.name=name;
        this.city=city;
        this.books=books;
        this.index=index;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void addBook(Book book){
        try{
            books[index]=book;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The library is full");
        }
        index++;

    }
    public void printBooks(){
        for(int i=0;i<books.length;i++){
            try{
                System.out.println(books[i].getData());
            }catch (NullPointerException e){
                System.out.println("The book is empty");
            }
        }
    }
}
