/**
 * Created by guswilerib on 12/10/2015.
 */
public class Book extends Reference {
    private String publisher;

    public Book(String author, String title, int publicationYear, String publisher){
        super(author, title, publicationYear);
        this.setPublisher(publisher);
    }

    public String getBibtexEntry(){
       return "@BOOK { REF" + this.getMyUniqueID() + ",\n" +
               "author = \"" + this.getAuthor() + "\",\n" +
               "title = \"" + this.getTitle() + "\",\n" +
               "publisher = \"" + publisher + "\",\n" +
               "year = \"" + this.getPublicationYear() + "\"\n" +
               "},";
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
