public class Producer implements Runnable {
    private Thread t;
    private Data data;
    
    Producer(Data data){
        t = new Thread(this, "Producer");
        this.data=data;
        t.start();
    }
    
    public void run(){
        try{
            for(int i=1;i<=20;i++){
                data.put(i);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            
        }
    }
}
