
/**
 * SE1021
 * Winter 2016
 * Lab 2 - Keeping our Sources Straight
 * Name: Ian Guswiler
 * Created: 12/10/2015
 */

/**
 * This class represents information about an article which is published in a journal.
 *
 * @author Ian Guswiler
 * @version 12/11/2015
 */
public class Article extends Reference {
    private int endingPage;
    private String journal;
    private int startingPage;


    /**
     * This method will return the ending page of the article.
     *
     * @return integer value of the last page of the reference.
     */
    public int getEndingPage() {
        return endingPage;
    }

    /**
     * This method will set the ending page of the article
     *
     * @param endingPage Ending page of the reference.
     */
    public void setEndingPage(int endingPage) {
        if(endingPage < this.startingPage){
            this.endingPage = this.startingPage;
        }else{
            this.endingPage = endingPage;
        }
    }

    /**
     * This method will return the journal the article is in.
     *
     * @return Name of the journal of the reference.
     */
    public String getJournal() {
        return journal;
    }

    /**
     * This method will set the name of the journal the article is in.
     *
     * @param journal Name of the journal.
     */
    public void setJournal(String journal) {
        this.journal = journal;
    }

    /**
     * This method will return the starting page number of the article.
     *
     * @return integer value of the starting page of the reference.
     */
    public int getStartingPage() {
        return startingPage;
    }

    /**
     * This method will set the starting page number of the article.
     *
     * @param startingPage Starting page number of the reference.
     */
    public void setStartingPage(int startingPage) {
        if(startingPage <= 0){
            this.startingPage = 1;
        }else{
            this.startingPage = startingPage;
        }
    }

    /**
     * This method will return the BibTex entry for th given reference. The BibTex entry is provided in BibTex format.
     *
     * @return A String representing the BibTex format.
     */
    public String getBibtexEntry(){
        return "@ARTICLE { REF" + this.getMyUniqueID() + ",\n" +
                "author = \"" + this.getAuthor() + "\",\n" +
                "title = \"" + this.getTitle() + "\",\n" +
                "journal = \"" + this.getJournal() + "\",\n" +
                "pages = \"" + this.getStartingPage() + "-" + this.getEndingPage() + "\",\n" +
                "year = \"" + this.getPublicationYear() + "\"\n" +
                "},";
    }


    /**
     * A constructor for an Article.
     *
     * @param author The author for the given item.
     * @param title The title of the publication.
     * @param publicationYear The year of the publication - This must be a positive number.
     * @param journal The name of the journal that is publishing the work.
     * @param startingPage The first page of the article. If a non-positive value is passed in,
     *                     the starting page is set to 1.
     * @param endingPage The last page of the article. If the value is less than the starting page,
     *                   the ending page is set equal to the starting page.
     */
    public Article(String author, String title, int publicationYear, String journal, int startingPage, int endingPage){
        super(author, title, publicationYear);
        this.setStartingPage(startingPage);
        this.setEndingPage(endingPage);
        this.setJournal(journal);
    }
}
