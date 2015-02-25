import java.io.*;
import java.util.*;
public class Mergesort{
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	int juan = 0;
	int too = 0;
	ArrayList<Integer> nu = new ArrayList<Integer>();
	while(juan < a.size() || too < b.size()){
	    if(juan >= a.size() && too < b.size()){
		nu.add(b.get(too));
		too ++;
	    }
	    else if(too >= b.size() && juan < a.size()){
		nu.add(a.get(juan));
		juan ++;
	    }
	    else if (a.get(juan) < b.get(too)){
		nu.add(a.get(juan));
		juan ++;
	    }
	    else{
		nu.add(b.get(too));
		too ++;
	    }
	}
	return nu;

    }

    public static void main(String[] args){
	Mergesort a = new Mergesort();
	ArrayList<Integer> blah = new ArrayList<Integer>();
	ArrayList<Integer> meh = new ArrayList<Integer>();
	blah.add(5);
	blah.add(6);
	blah.add(7);
	meh.add(1);
	meh.add(2);
	meh.add(3);
	meh.add(4);
	meh.add(5);
	meh.add(6);
	System.out.println(a.merge(blah,meh));
	
	
    }


}
