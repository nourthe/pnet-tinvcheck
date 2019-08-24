package transInvCheck;

import java.util.List;
import java.util.ArrayList;

public class FileTransitionsReader {
    public static List<Transitions> read(String file){
	List<Transitions> sequence = new ArrayList<>();
	mockFill(sequence);
        return sequence;
    }
    private static void mockFill(List<Transitions> list){
	    list.add(Transitions.T0);
	    list.add(Transitions.T1);
	    list.add(Transitions.T0);
	    list.add(Transitions.T2);
	    list.add(Transitions.T1);
	    list.add(Transitions.T0);
	    list.add(Transitions.T2);
	    list.add(Transitions.T1);
	    list.add(Transitions.T3);
	    list.add(Transitions.T6);
	    list.add(Transitions.T3);
    }
}
