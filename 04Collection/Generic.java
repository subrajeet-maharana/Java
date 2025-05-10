package Collection;
public class Generic<T extends Number, U> {
    T[] arr;
    Generic(T[] arr){
        this.arr=arr;
    }
    
    double avg(){
        double sum=0;
        for(T v:arr){
            sum+=v.doubleValue();
        }
        return sum/arr.length;
    }
    boolean isEqual(Generic<? extends Number, ?> anotherObj){
        if(this.arr==anotherObj.arr){
            return true;
        }
        return false;
    }
}
