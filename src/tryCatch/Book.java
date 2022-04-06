package tryCatch;

public class Book {
    int id;
    String name;
    String author;

    public Book(){
    }
    public Book(int id, String name, String author){
        this.id=id;
        this.name=name;
        this.author=author;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getData(){
        return id+" "+name+" "+author;
    }
}