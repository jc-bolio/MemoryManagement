import java.util.ArrayList;
import java.util.List;


public class Main {



    public static void main(String[] args) {

        Table table = new Table();
        table.printTable();

        Memory RP = new Memory("Registros del Procesador", 30);
        Memory L1 = new Memory("Cache L1", 120);
        Memory L2 = new Memory("Cache L2", 480);
        Memory L3 = new Memory("Cache L3", 1920);
        Memory RAM = new Memory("RAM", 19200);

        List<String> row = new ArrayList<>();

        for (int i = 0; i < table.getSize() - 1; i++){
            int dataSize = table.getMemory(i);

            row.add("ID: " + table.getID(i));
            row.add("Accesos Previos: " + table.getPreviousAccess(i));
            row.add("Memoria usada: " + table.getMemory(i) + "u");

            RP.addData(dataSize, row);
            L1.addData(dataSize, row);
            L2.addData(dataSize, row);
            L3.addData(dataSize, row);
            RAM.addData(dataSize, row);

            row.clear();
        }

        RP.printStoredData();
        L1.printStoredData();
        L2.printStoredData();
        L3.printStoredData();
        RAM.printStoredData();
    }
}
