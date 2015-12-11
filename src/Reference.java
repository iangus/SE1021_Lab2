
/**
 * SE1021
 * Winter 2016
 * Lab 2 - Keeping our Sources Straight
 * Name: Ian Guswiler
 * Created: 12/10/2015
 */

/**
 * This class will store a Bibtex reference. A BibTex reference is a generic reference that exists in a system.
 *
 * @author Ian Guswiler
 * @version 12/11/2015
 */
public class Reference {
    private String author;
    private static int instanceCount = 0;
    private final int myUniqueID;
    private int publicationYear;
    private String title;


    /**
     * This method will return the author of the reference.
     *
     * @return The person who wrote the reference as a String.
     */
    public String getAuthor(){
        return author;
    }

    /**
     * This method will set the author.
     *
     * @param author String of the person who wrote the reference.
     */
    public void setAuthor(String author){
        this.author = author;
    }

    /**
     * This method will return the publication year.
     *
     * @return Year the reference was published.
     */
    public int getPublicationYear(){
        return publicationYear;
    }

    /**
     * This method will set the publication year. It must be a positive value; otherwise, the change will not occur.
     *
     * @param publicationYear Year the reference was published.
     */
    public void setPublicationYear(int publicationYear){
        if(publicationYear >= 0){
            this.publicationYear = publicationYear;
        }
    }

    /**
     * This method will return the title of the reference.
     *
     * @return The title of the reference as a String.
     */
    public String getTitle(){
        return title;
    }

    /**
     * This method will set the title of the reference.
     *
     * @param title The title of the reference.
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * This method will return the unique ID for this class.
     *
     * @return Unique ID for the reference.
     */
    public int getMyUniqueID(){
        return myUniqueID;
    }

    /**
     * This method will return the BibTex entry for the given reference. The BibTex entry is provided in BibTex format.
     *
     * @return String representing the BibTex format.
     */
    public String getBibtexEntry(){
        return "@REFERENCE { REF" + myUniqueID + ",\n" +
                "author = \"" + author + "\",\n" +
                "title = \"" + title + "\",\n" +
                "year = \"" + publicationYear + "\"\n" +
                "},";
    }


    /**
     *  This is a constructor for reference.
     *
     * @param author Author of the reference.
     * @param title Title of the reference.
     * @param publicationYear Year the reference was published. Since the number must not be negative, the absolute
     *                        value of it is used when assigning the publication year.
     */
    public Reference(String author, String title, int publicationYear){
        myUniqueID = instanceCount;
        instanceCount++;
        this.setAuthor(author);
        this.setTitle(title);
        this.setPublicationYear(Math.abs(publicationYear));
    }
}
