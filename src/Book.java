
/**
 * SE1021
 * Winter 2016
 * Lab 2 - Keeping our Sources Straight
 * Name: Ian Guswiler
 * Created: 12/10/2015
 */

/**
 * This class referents a bibtex entry for a Book, which is a type of a reference.
 *
 * @author Ian Guswiler
 * @version 12/11/2015
 */
public class Book extends Reference {
    private String publisher;


    /**
     * This method will return the publisher of the book.
     *
     * @return publisher of the book as a String.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * This mehtod will set the publisher for the book.
     *
     * @param publisher publisher of the book.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * This method will return the BibTex entry for the given reference. The BibTex entry is provided in BibTex format.
     *
     * @return a String representing the BibTex format.
     */
    public String getBibtexEntry(){
        return "@BOOK { REF" + this.getMyUniqueID() + ",\n" +
                "author = \"" + this.getAuthor() + "\",\n" +
                "title = \"" + this.getTitle() + "\",\n" +
                "publisher = \"" + this.getPublisher() + "\",\n" +
                "year = \"" + this.getPublicationYear() + "\"\n" +
                "},";
    }


    /**
     * This is a constructor for a reference
     *
     * @param author This is the author for the given item.
     * @param title This is the title of the publication.
     * @param publicationYear This is the year of publication. It is a positive number.
     * @param publisher This is the name of the publisher.
     */
    public Book(String author, String title, int publicationYear, String publisher){
        super(author, title, publicationYear);
        this.setPublisher(publisher);
    }
}
