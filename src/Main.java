public class Main {

    public static void main(String[] args) {

        Table table = new Table();
        table.printTable();

        Memory RP = new Memory("Registros del Procesador", 120);
        Memory L1 = new Memory("L1", 120);
        Memory L2 = new Memory("L2", 120);
        Memory L3 = new Memory("L3", 120);
        Memory RAM = new Memory("L1", 120);
    }
}
