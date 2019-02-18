import java.util.ArrayList;
import java.util.List;

public class Memory {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    private String name;
    private int size;
    private ArrayList<String> storedData;

    public Memory(String name, int size){
        this.name = name;
        this.size = size;
        this.storedData = new ArrayList<>();
    }

    public void addData(int dataSize, List<String> data){
        if(dataSize <= this.size){
            this.size -= dataSize;
            this.storedData.addAll(data);
        }
    }

   public void printStoredData(){
       System.out.println(ANSI_BLUE + "Memoria: " + this.name + ", Espacio libre: " + this.size + "u" + ANSI_RESET);
        for (int i = 0; i < this.storedData.size(); i++){
            System.out.println(storedData.get(i));
        }
   }
}