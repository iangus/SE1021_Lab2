
import java.util.Scanner;

/**
 * A simple test program for SE1021 laboratory assignment 2 in
 * winter 2014-2015.
 * @author schilling with minor edits by taylor
 * @version 1.1-20141205
 */
public class Main {

    /**
     * Provides a menu to obtain book and article references and then
     * display them to the console window.
     * @param args ignored
     */
    public static void main(String[] args) {
        // This variable will hold the references used.
        ReferenceHolder references = new ReferenceHolder();

        // Setup the keyboard as an input.
        Scanner in = new Scanner(System.in);

        char entry = '-';
        do {
            // Prompt the user for input.
            printPrompt();

            // Get the entry.
            String input = in.nextLine();
            if(input.length()==1) {
                entry = input.charAt(0);
            }

            switch (entry) {
                case '1': // Add a new book.
                    Book book = createBookEntry(in);
                    references.addReference(book);
                    break;
                case '2': // Add a new Article.
                    Article article = createArticleEntry(in);
                    references.addReference(article);
                    break;
                case '3': // Print everything.
                    references.printAllBibtexEntries();
                    break;
            }
        } while (entry!='0');

    }

    /**
     * Displays main menu to the console.
     */
    public static void printPrompt() {
        System.out.println("Enter 0 to exit the program.");
        System.out.println("Enter 1 to enter a new book into the reference set.");
        System.out.println("Enter 2 to enter a new article into the reference set.");
        System.out.println("Enter 3 to printout the entries in Bibtex format.");
    }

    /**
     * This method will allow the user to enter the information for the book.
     * @param in This is the keyboard.
     * @return A book will be returned.
     */
    public static Book createBookEntry(Scanner in) {
        System.out.println("Enter the author of the book");
        String author = in.nextLine();

        System.out.println("Enter the title of the book");
        String title = in.nextLine();

        System.out.println("Enter the publisher for the book.");
        String publisher = in.nextLine();

        System.out.println("Enter the copyright year for the book.");
        int copyright = Integer.parseInt(in.nextLine());

        return new Book(author, title, copyright, publisher);
    }

    /**
     * This method will allow the user to enter the information for an article.
     * @param in This is the keyboard.
     * @return An article will be returned.
     */
    public static Article createArticleEntry(Scanner in) {
        System.out.println("Enter the author of the article");
        String author = in.nextLine();

        System.out.println("Enter the title of the article");
        String title = in.nextLine();

        System.out.println("Enter the title of the journal.");
        String journal = in.nextLine();

        System.out.println("Enter the first page of the article.");
        int start = Integer.parseInt(in.nextLine());

        System.out.println("Enter the last page of the article.");
        int end = Integer.parseInt(in.nextLine());

        System.out.println("Enter the copyright year for the article.");
        int copyright = Integer.parseInt(in.nextLine());

        return new Article(author, title, copyright, journal, start, end);
    }

}