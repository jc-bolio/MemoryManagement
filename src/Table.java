import java.util.Arrays;
import java.util.Random;

public class Table {

    private int[][] table;

    public Table(){
        this.table = generateTable();
    }

    public int[][] generateTable() {
        int[][] generatedTable = new int[200][2];

        Random rng = new Random();

        for (int row = 0; row < generatedTable.length; row++) {

            for (int column = 0; column < generatedTable[row].length; column++) {

                if (column == 0)
                    generatedTable[row][0] = (int) (rng.nextGaussian()*10+15);

                else
                    generatedTable[row][1] = (int) (int) (rng.nextGaussian()*15+20);
            }
        }

        return generatedTable;
    }

    public double getMemory(int process){
        return this.table[process][0];
    }

    public double getPreviousAccess(int process){
        return this.table[process][1];
    }

    public void printTable(){
        System.out.println(Arrays.deepToString(this.table));
    }
}
