/**
 * Created by guswilerib on 12/10/2015.
 */
public class Article extends Reference {
    private int endingPage;
    private String journal;
    private int staringPage;

    public Article(String author, String title, int publicationYear, String journal, int startingPage, int endingPage){
        super(author, title, publicationYear);
        this.setEndingPage(endingPage);
        this.setJournal(journal);
        this.setStaringPage(startingPage);
    }

    public String getBibtexEntry(){
        return "@ARTICLE { REF" + this.getMyUniqueID() + ",\n" +
                "author = \"" + this.getAuthor() + "\",\n" +
                "title = \"" + this.getTitle() + "\",\n" +
                "journal = \"" + journal + "\",\n" +
                "pages = \"" + staringPage + "-" + endingPage + "\",|n" +
                "year = \"" + this.getPublicationYear() + "\"\n" +
                "},";
    }

    public int getEndingPage() {
        return endingPage;
    }

    public void setEndingPage(int endingPage) {
        this.endingPage = endingPage;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public int getStaringPage() {
        return staringPage;
    }

    public void setStaringPage(int staringPage) {
        this.staringPage = staringPage;
    }
}
