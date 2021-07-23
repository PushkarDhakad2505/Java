package Multithreading.ThreadExecutionPrevention;
class T1 extends Thread{
    PrintingEvenOddNumber gfg;
    T1(PrintingEvenOddNumber gfg){
        this.gfg=gfg;        
        }
            public void run(){
                gfg.printEvenNumber();
            }
            
        }
        class T2 extends Thread{
        PrintingEvenOddNumber gfg;
        T2(PrintingEvenOddNumber gfg){
           
            this.gfg=gfg;        
    } 
        
            public void run(){
                gfg.printOddNumber();
            } 
        }
public class PrintingEvenOddNumber {
    
	int counter = 1; 
	static int N; 

	public void printOddNumber() 
	{ 
		synchronized (this) 
		{ 
			while (counter < N) { 

				while (counter % 2 == 0) { 

					try { 
						wait(); 
					} 
					catch ( Exception e) { 
						System.out.println(e);
					} 
				} 

				System.out.println(Thread.currentThread().getName()+" "+counter + " "); 
				counter++; 

				notify(); 
			} 
		} 
	} 

	public   void printEvenNumber() 
	{ 
		synchronized (this) 
		{ 
			while (counter < N) { 

				while (counter % 2 == 1) { 

					try { 
						wait(); 
					} 
					catch ( Exception e) { 
						System.out.println(e); 
					} 
				} 
				System.out.println( Thread.currentThread().getName()+" "+counter + " "); 

				counter++; 
				notify(); 
			} 
		} 
	} 

	public static void main(String[] args) 
	{ 
	
		N = 20; 

		PrintingEvenOddNumber mt = new PrintingEvenOddNumber(); 
                
                T1 t1=new T1(mt);
                T2 t2=new T2(mt);

		t1.start(); 
		t2.start(); 
	} 
} 
