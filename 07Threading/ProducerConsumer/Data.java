public class Data {
    private int n;
    private boolean available;
    
    Data(){
        available=false;
    }
    
    synchronized void get(){
        while(!available){
            try{
                wait();
            }
            catch(InterruptedException e){
                
            }
        }
        System.out.println("Got "+n);
        available=false;
        notify();
    }
    
    synchronized void put(int n){
        while(available){
            try{
                wait();
            }
            catch(InterruptedException e){
                
            }
        }
        this.n=n;
        available=true;
        System.out.println("Put "+ n);
        notify();
    }
}
