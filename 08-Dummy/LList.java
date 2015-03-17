public class LList{
    private Node l=null;
    private int length = 0;
    public void add(String s){
	l.setData(s);
	Node dum = new Node();
	dum.setNext(l);
	l = dum;
	length ++;
    }
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    public String find(int n){
	Node temp = l;
	for(int i = 0;i < n; i ++){
	    temp = temp.getNext();
	}
	return temp.getData();	
    }
    public void insert(int index, String s){
	Node a = new Node(s);
	Node before = l;
	for(int i = 0; i < index - 1;i ++){
	    before = before.getNext();
	}
	Node after = l;
	for(int i = 0; i < index; i ++){
	    after = after.getNext();
	}
	a.setNext(after);
	before.setNext(a);
	
    }
}
