/**
 * Created by NickR on 27.04.2017.
 */
public class NodeImutable implements Inode {
    private final int value;

    private final Inode left;

    private final Inode right;

    public NodeImutable(final int value, final Inode left, final Inode right){
        this.value = value;
        this.left = left;
        this.right = right;
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
            if (this.left == null) return new NodeImutable(this.value, new NodeImutable(value, null, null), this.right);

            return new NodeImutable(this.value, this.left.add(value), this.right);

        }
            if (this.right == null) return new NodeImutable(this.value, this.left, new NodeImutable(value, null, null));

            return new NodeImutable(this.value, this.left, this.right.add(value));

    }

        @Override
        public int count () {
            int leftCount = this.left != null ? this.left.count() : 0;
            int rightCount = this.right != null ? this.right.count() : 0;
            return leftCount + 1 + rightCount;
        }

    }