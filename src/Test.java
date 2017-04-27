import java.util.Random;

/**
 * Created by NickR on 27.04.2017.
 */
public class Test {

    public static void main(String[] args) {

        final Random r = new Random();

        Inode node = new Node(345);
        //Inode node = new NodeImutable(0, null, null);

        for(int i = 0; i< 1000; i++){

            node.add(Math.abs(r.nextInt()%500));

        }

        node.print();

        System.out.println("count = " + node.count());
    }


}
