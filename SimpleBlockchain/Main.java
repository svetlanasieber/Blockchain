package SimpleBlockchain;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    /**
     * Hash = digital signature
     * <p>
     * Each block will have:
     * <p>
     * List of transactions
     * Previous Hash
     * <p>
     * Hash
     */


    ArrayList<Block> blockchain = new ArrayList<>();
    public static void main(String[] args) {

        String[] genesisTransactions = {"satoshi sent lana 10 bitcoin", "heinz frieder sent 10 bitcoins to lana"};
        int previousHash;
        final int i = 0;
        Block genesisBlock = new Block( 0, genesisTransactions);

       //System.out.println(genesisBlock.ge);


        //String[] list1 = {"a", "b", "c"};
        //String[] list2 = {"aa", "b", "c"}; //String[] list2 = {"a", "b", "c"};
        //System.out.println(Arrays.hashCode(list1));
        //System.out.println(Arrays.hashCode(list2));
    }
}
