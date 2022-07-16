import java.util.Iterator;
import java.util.TreeSet;

import Model.entity.Branch;
public class App {
   public static void main(String[] args) throws Exception {
    
        Branch branch1 = new Branch("Branch 1");
        branch1.addLeaf("leaf1");
        branch1.addLeaf("leaf2");

        Branch branch2 = new Branch("branch 2");
        branch2.addLeaf("leaf3");
        branch2.addLeaf("leaf4");

        TreeSet<Branch> branches = new TreeSet<Branch>();
        branches.add(branch1);
        branches.add(branch2);

        Iterator<Branch> iterator = branches.iterator();

        for (Branch branch : branches) {
            System.out.println(branch);
        }
    }
}
