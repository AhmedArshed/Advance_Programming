public class thread {
    // static int sum=0;
    static int CountEven = 0;
    static int CountPrime = 0;
public static void checkPrime(int n){  
        int m=0,flag=0;      
        m=n/2;      
        if(n==0||n==1){  
         flag = 1;      
        }else{  
         for(int i=2;i<=m;i++){      
          if(n%i==0){  
           flag=1;      
           break;      
          }      
         }      
         if(flag==0)  {CountPrime +=1;}  
        }
      }
    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for (int i = 0 ; i <= 10000 ; i++) 
        thread.checkPrime(i);
        System.out.println("Number of Prime no in 10000 are :"+thread.CountPrime);
    }
}
class Runnable1 implements Runnable{
    public void run(){
        for(int i=0;i<=10000;i++){
            if(i%2 == 0){
                thread.CountEven+=1;
            }
        }
        System.out.println("Number of even no in 10000 are :"+thread.CountEven);
    }
}