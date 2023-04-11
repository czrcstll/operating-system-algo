package Custom;


public class Process {
    private int size;
    private int partition;
    
    public Process(int size, int partition){
        this.size = size;
        this.partition = partition;
    }
    
    public Process(Process process){
        this.size = process.size;
        this.partition = process.partition;
    }
    
    public int size(){
        return this.size;
    }
    
    public int partition(){
        return this.partition;
    }
}
