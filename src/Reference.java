/**
 * Created by guswilerib on 12/10/2015.
 */
public class Reference {
    private String author;
    private static int instanceCount = 0;
    private final int myUniqueID;
    private int publicationYear;
    private String title;

    public String getAuthor(){
        return author;
    }

    public String getBibtexEntry(){
        return "@REFERENCE { REF" + myUniqueID + ",\n" +
                "author = \"" + author + "\",\n" +
                "title = \"" + title + "\",\n" +
                "year = \"" + publicationYear + "\"\n" +
                "},";
    }

    public int getMyUniqueID(){
        return myUniqueID;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public String getTitle(){
        return title;
    }


    public Reference(String author, String title, int publicationYear){
        myUniqueID = instanceCount;
        instanceCount++;
        this.setAuthor(author);
        this.setTitle(title);
        this.setPublicationYear(publicationYear);
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
