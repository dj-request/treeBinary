/**
 * Created by NickR on 27.04.2017.
 */
public class Node implements Inode {

    private final int value;

    private Inode left = null;

    private Inode right = null;

    public Node(final int value){
        this.value = value;
    }


    @Override
    public void print() {
        if(this.left!=null) this.left.print();
        System.out.println(this.value);
        if(this.right!=null) this.right.print();

    }



    @Override
    public Inode add(Integer value) {
        if (value == this.value) return this;

        if (value < this.value) {
            if (this.left == null)
                this.left = new Node(value);
             else
                this.left = this.left.add(value);

            return this;
        }
       // if (value > this.value) {
            if (this.right == null)
                this.right = new Node(value);
             else
                this.right = this.right.add(value);

            return this;


    }

    @Override
    public int count() {
        int leftCount = this.left!=null? this.left.count():0;
        int rightCount = this.right!=null? this.right.count():0;
        return leftCount + 1 + rightCount;
    }
}
