import java.util.ArrayList;
import java.util.List;

public class Memory {

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
       System.out.println("Memoria " + this.name + ", Espacio libre: " + this.size + "u");
        for (int i = 0; i < this.storedData.size(); i++){
            System.out.println(storedData.get(i));
        }
   }
}