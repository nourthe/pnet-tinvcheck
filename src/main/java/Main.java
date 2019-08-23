import transInvCheck.TInvariant;
import transInvCheck.TransInvChecker;
import transInvCheck.Transitions;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TInvariant> transInv = new ArrayList<TInvariant>();
        List<Transitions> rest = TransInvChecker.checkTransitions(transInv, "/var/out/transitions.txt");
    }
}
