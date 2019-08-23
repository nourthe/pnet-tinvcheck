package transInvCheck;

import java.util.ArrayList;
import java.util.List;

public class TInvariant {

    // List of the Invariant transitions.
    private List<Transitions> transitions;

    // Pointer to the current transition.
    private int p;

    public void TInvariant(){
        transitions = new ArrayList<>();
        p = 0;
    }

    public void addAll(List<Transitions> transitions){
        this.transitions.addAll(transitions);
    }

    public void add(Transitions transition){
        this.transitions.add(transition);
    }

    public boolean hasNext(){
        return (p+1) < transitions.size();
    }

    public void next(){
        p++;
    }

    public void previous(){
        p--;
    }

    public Transitions getCurrent(){
        return transitions.get(p);
    }

    public void reset(){
        p = 0;
    }
}
