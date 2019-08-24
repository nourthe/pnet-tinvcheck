package transInvCheck;

import java.util.ArrayList;
import java.util.List;

public class TInvariant {

    // List of the Invariant transitions.
    private List<Transitions> transitions;

    // Pointer to the current transition.
    private int p;

    public TInvariant() {
        this.transitions = new ArrayList<>();
        setP(0);
    }

    public List<Transitions> getTransitions() {
        return transitions;
    }

    public int getP(){
        return p;
    }

    public void setP(int p) {
        this.p = p;
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
        if(transitions.size() > 0 && p>=0) {
            return transitions.get(p);
        }else{
            return null;
        }
    }

    public void reset(){
        p = 0;
    }

}
