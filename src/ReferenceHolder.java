
/**
 * SE1021
 * Winter 2016
 * Lab 2 - Keeping our Sources Straight
 * Name: Ian Guswiler
 * Created: 12/10/2015
 */

import java.util.ArrayList;

/**
 * This class is a holder for references. It will keep a set of them and allow them to be printed out to the console.
 *
 * @author Ian Guswiler
 * @version 12/11/2015
 */
public class ReferenceHolder {
    private ArrayList<Reference> references = new ArrayList<>();


    /**
     * This method will ass a reference to the list of references.
     *
     * @param myReference The reference that is to be stored.
     */
    public void addReference(Reference myReference){
        references.add(myReference);
    }

    /**
     * This method will print out the BibTex entries in Reference list to the console.
     */
    public void printAllBibtexEntries(){
        for(Reference reference: references){
            System.out.println(reference.getBibtexEntry());
        }
    }
}
