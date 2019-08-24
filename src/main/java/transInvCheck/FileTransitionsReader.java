package transInvCheck;

import java.util.List;
import java.util.ArrayList;

public class FileTransitionsReader {

	private static boolean mock = false;

    public static List<Transitions> read(String file){
	List<Transitions> sequence = new ArrayList<>();
	mockFillVeryLong(sequence);
        return sequence;
    }
	public static void setMock(){ setMock(true); }
	public static void setMock(boolean value){ mock = value; }

	private static void mockFill3(List<Transitions> list){
    	list.add(Transitions.T0);
		list.add(Transitions.T0);
		list.add(Transitions.T1);
		list.add(Transitions.T1);
		list.add(Transitions.T2);
		list.add(Transitions.T6);
		list.add(Transitions.T3);
	}
	private static void mockFill2(List<Transitions> list){
    	list.add(Transitions.T0);
		list.add(Transitions.T1);
		list.add(Transitions.T2);
		list.add(Transitions.T0);
		list.add(Transitions.T1);
		list.add(Transitions.T6);
		list.add(Transitions.T3);
	}
	private static void mockFill1(List<Transitions> list){
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
	private static void mockFillLong(List<Transitions> list){
		list.add(Transitions.T0);
		list.add(Transitions.T4);
		list.add(Transitions.T0);
		list.add(Transitions.T5);
		list.add(Transitions.T0);
		list.add(Transitions.T4);
		list.add(Transitions.T1);
		list.add(Transitions.T5);
		list.add(Transitions.T0);
		list.add(Transitions.T2);
		list.add(Transitions.T3);
		list.add(Transitions.T1);
		list.add(Transitions.T0);
		list.add(Transitions.T2);
		list.add(Transitions.T0);
		list.add(Transitions.T0);
		list.add(Transitions.T1);
		list.add(Transitions.T6);
		list.add(Transitions.T0);
		list.add(Transitions.T3);
		list.add(Transitions.T1);
		list.add(Transitions.T0);
		list.add(Transitions.T4);
		list.add(Transitions.T1);
		list.add(Transitions.T2);
		list.add(Transitions.T3);
		list.add(Transitions.T1);
		list.add(Transitions.T2);
		list.add(Transitions.T6);
		list.add(Transitions.T5);
		list.add(Transitions.T3);
	}
	private static void mockFillVeryLong(List<Transitions> list){
    	for(int i = 0; i < 16000; i++){
    		mockFillLong(list);
		}
	}
}
