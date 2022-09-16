package assigments5;


//Implementing Runnable interface
			class Thread1 implements Runnable    
			{
				
				//overriding of run method
				public void run() 
				{
					int sum=0;
					
					for(int i=1;i<=50;i++)
					{
						sum = sum+i;
					}
					
					double avg = sum/50;
					
					System.out.println("Average of 50 numbers are: "+avg);
				}
			}

			//implementing Runnable interface in main method
			public class ThreadTest implements Runnable    
			{    
				public void run()
				{
					int array[] = {15,20,25,40,30};
					int result[]=new int[array.length];
					
					System.out.println("Square of arrays numbers:");
					for(int i=0;i<array.length;i++)
					{
						result[i] = array[i]*array[i];
						System.out.print(result[i]+" ");
					}
					
					
				}
			    
					// main method  
					public static void main(String argvs[])  
					{   
						// creating an object  
							Runnable r1 = new Thread1(); 
							
						// creating an object 
							Runnable r2 = new ThreadTest();
							
							
						// creating an object  
							Thread th1 = new Thread(r1);    
							Thread th2 = new Thread(r2);
							
							th1.start();
							th2.start();
			  
							
			}    
			}   

