package PACKAGE_NAME.lms.model;

public class Book extends Libaryitem {
    private String author;
    public Book(String id, String title, String author) {
       super(id,title);
       setAuthor(author);
    }

    public void setAuthor(String author){
        if(author.trim().isEmpty()){
            throw new IllegalArgumentException("Author cant be Empty ");
        }else{
            this.author = author;
        }

    }
    public String getAuthor(){
        return author;
    }

    public double calculateLateFee(int daysLate) {

        return super.calculateLateFee(daysLate);
    }
}

