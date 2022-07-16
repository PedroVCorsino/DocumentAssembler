package Model.entity;
import java.util.TreeSet;

public class Branch implements Comparable<Branch> {
    
    private String name;
    private TreeSet<Leaf> leaves;

    public Branch(String text) {
        this.name = text;
        this.leaves = new TreeSet<Leaf>();
    }

    public void addLeaf(String text) {
        if(leaves.isEmpty()){
            leaves.add(new Leaf(1, text));
        } else {
            Leaf lastLeaf = leaves.last();
            leaves.add(new Leaf(lastLeaf.getIndexLeaf() + 1, text));
        }
    }

    @Override
    public String toString() {
        return name + ": " + leaves.toString();
    }

    @Override
    public int compareTo(Branch o) {
        return name.compareTo(o.name);
    }

}
