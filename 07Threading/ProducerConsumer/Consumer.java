public class Consumer implements Runnable {
    private Thread t;
    private Data data;
    
    Consumer(Data data){
        t = new Thread(this, "Consumer");
        this.data=data;
        t.start();
    }
    
    public void run(){
        try{
            for(int i=1;i<=20;i++){
                data.get();
                Thread.sleep(4000);
            }
        }
        catch(InterruptedException e){
            
        }
    }
}
