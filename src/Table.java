import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Table {

    private int[][] table;

    public Table(){
        this.table = generateTable();
    }

    public int[][] generateTable() {
        int[][] generatedTable = new int[200][4];

        Random rnd = new Random();

        for (int row = 0; row < generatedTable.length; row++) {

            for (int column = 0; column < generatedTable[row].length; column++) {

                if (column == 0)
                    generatedTable[row][0] = row;

                else if (column == 1) {
                    generatedTable[row][1] = (int) (rnd.nextGaussian() * 10 + 15);

                    if(generatedTable[row][1] <= 0)
                        generatedTable[row][1] = (generatedTable[row][1] * -1) + 1;
                }

                else if (column == 2) {
                    generatedTable[row][2] = (int) (rnd.nextGaussian() * 15 + 20);

                    if(generatedTable[row][2] < 0)
                        generatedTable[row][2] = generatedTable[row][2] * -1;
                }

                else
                    generatedTable[row][3] = generatedTable[row][2]/(generatedTable[row][1]);
            }
        }

        sortbyColumn(generatedTable, 3);

        return generatedTable;
    }

    public static void sortbyColumn(int array[][], int column) {

        Arrays.sort(array, new Comparator<int[]>() {

            public int compare(final int[] entry1,
                               final int[] entry2) {
                if (entry1[column] < entry2[column])
                    return 1;
                else
                    return -1;
            }
        });
    }


    public int getSize(){
        return 200;
    }
    public int getID(int process){
        return this.table[process][0];
    }

    public int getMemory(int process){
        return this.table[process][1];
    }

    public int getPreviousAccess(int process){
        return this.table[process][2];
    }

    public void printTable(){
        System.out.println(Arrays.deepToString(this.table));
    }
}
