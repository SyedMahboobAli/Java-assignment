/*Syed Mahboob Ali
1602-18-733-055
CSE-A*/

package Assignment2;
import java.util.Scanner;
public class thread implements Runnable 
{
	static int count=0;
	static int sec=0;
	static int i=0;
	Thread t;
	int n;
	int se;
	String s;
	thread(int num,int sec)
	{
		se=sec;
		n=num;
		s="Thread"+num;
		t=new Thread(this,s);
		t.start();
	}
	synchronized public void work() throws InterruptedException
	{
		while(count<16)
		{
			if(i>3)
			{
				System.out.println();
				sec+=se;
				i=0;
				System.out.print(s+":" +sec + ", ");
				try {
					Thread.sleep(se*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
				count++;
			}
			else
			{
				sec+=se;
				System.out.print(s+":"+sec + ",");
				
				try {
					Thread.sleep(se*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
				count++;
			}
		}
	}
	public void run()
	{
		try {
			work();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner( System.in );
		System.out.print("Enter the time slot: ");
		int sec= myInput.nextInt();
		thread t1=new thread(1,sec);
		thread t2=new thread(2,sec);
		thread t3=new thread(3,sec);
		thread t4=new thread(4,sec);
		
		

		try {
			Thread.sleep(sec*1000);
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}

