public class Counter {
    public int count = 0;
    private Counter(){}
    public static Counter counter;
    public static Counter getCounter(){
        if(counter==null){
            counter = new Counter();
        }
        return counter;
    }
    public void addCount(){
        count++;
    }
}
