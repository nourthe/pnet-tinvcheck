import transInvCheck.TInvariant;
import transInvCheck.TransInvChecker;
import transInvCheck.Transitions;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TInvariant> transInv = new ArrayList<TInvariant>();
	fill(transInv);
        List<Transitions> rest = TransInvChecker.checkTransitions(transInv, "/var/out/transitions.txt");

	System.out.println(rest);
	System.out.println("Execution finished correctly.");
    }
    public static void fill(List<TInvariant> list){
		TInvariant inv1 = new TInvariant();
		inv1.add(Transitions.T0);
		inv1.add(Transitions.T1);
		inv1.add(Transitions.T2);
		inv1.add(Transitions.T3);
		TInvariant inv2 = new TInvariant();
		inv2.add(Transitions.T0);
		inv2.add(Transitions.T1);
		inv2.add(Transitions.T6);
		list.add(inv1);
		list.add(inv2);
    }
}
