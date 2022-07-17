package document;

//import java.util.Iterator;
import java.util.TreeSet;

public class Document {
	public static void main(String[] args) {
		
		Branch branch1 = new Branch("Branch1");
		branch1.addLeaf("leaf1");
		branch1.addLeaf("leaf2");
		
		
		Branch branch2 = new Branch("Branch2");
		branch2.addLeaf("leaf3");
		branch2.addLeaf("leaf4");
		
		
		TreeSet<Branch> branches = new TreeSet<Branch>();
		branches.add(branch1);
		branches.add(branch2);
	
	
		//Iterator<Branch> iterator = branches.iterator();
		
		for (Branch branch : branches) {
			System.out.println(branch);
		}
	}
}
