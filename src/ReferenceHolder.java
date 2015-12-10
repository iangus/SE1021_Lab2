import java.util.ArrayList;

/**
 * Created by guswilerib on 12/10/2015.
 */
public class ReferenceHolder {
    private ArrayList<Reference> references = new ArrayList<>();


    public void addReference(Reference myReference){
        references.add(myReference);
    }

    public void printAllBibtexEntries(){
        for(Reference reference: references){
            System.out.println(reference.getBibtexEntry());
        }
    }
}
