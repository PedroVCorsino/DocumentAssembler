package Model.entity;

public class Leaf implements Comparable<Leaf> {

    private Integer indexLeaf;
    private String name;

    public Leaf(Integer i, String t) {
        this.indexLeaf = i;
        this.name = t;
    }
    

    public Integer getIndexLeaf() {
        return indexLeaf;
    }


    public void setIndexLeaf(Integer indexLeaf) {
        this.indexLeaf = indexLeaf;
    }


    public String getname() {
        return name;
    }


    public void setname(String name) {
        this.name = name;
    }


    public String toString() {
        return name + ": " + indexLeaf;
    }

    @Override
    public int compareTo (Leaf o) {
            return indexLeaf - o.indexLeaf;
    }

}
