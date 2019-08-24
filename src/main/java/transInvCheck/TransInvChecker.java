package transInvCheck;

import java.util.ArrayList;
import java.util.List;

public class TransInvChecker {
    /**
     * @param transInvs List of Transition Invariants(ArrayLists)
     * @param file Location of the file with the transitions sequence
     * @return
     */
    public static List<Transitions> checkTransitions(List<TInvariant> transInvs, String file){
        List<Transitions> transitionsSequence = FileTransitionsReader.read(file);

        while( transitionsSequence.size() > 0){
            TInvariant tInvFound = new TInvariant();

            int i = search(transInvs, transitionsSequence, tInvFound);

            if (i == -1){ return transitionsSequence; }
            else{
                reverseDelete(tInvFound, transitionsSequence, i);

                for (TInvariant tInv : transInvs){
                    tInv.reset();
                }
            }

        }
        return transitionsSequence;
    }

    private static int search(List<TInvariant> transInvs, List<Transitions> transitionsSequence, TInvariant tInvFound) {
        for (int i=0; i<transitionsSequence.size(); i++){
            for( TInvariant tInv : transInvs){
                if(transitionsSequence.get(i) == tInv.getCurrent()){
                    if(tInv.hasNext()){
                        tInv.next();
                    }
                    else{
                        tInvFound.addAll(tInv.getTransitions());
                        tInvFound.setP(tInv.getP());
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    private static void reverseDelete(TInvariant tInvFound, List<Transitions> transitionsSequence, int p) {
        int i = p;

        while ( i >= 0 ){
            try {
                if (transitionsSequence.get(i) == tInvFound.getCurrent()) {
                    tInvFound.previous(); // I step back
                    transitionsSequence.remove(i); // I delete de Transition corresponding to the invariant
                }
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
            i--;
        }
    }

}
