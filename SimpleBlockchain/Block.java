package SimpleBlockchain;



import java.util.Arrays;

public class Block {
    private final int previousHash;
    private final String[] transactions;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;


        Object[] contens = {Arrays.hashCode(transactions), previousHash};
        int blockHash = Arrays.hashCode(contens);
    }
    public int getPreviousHash() {
        return previousHash;
    }
    public String[] getTransaction() {
        return transactions;
    }


}
