public class InitialsTh
{
//http://introcs.cs.princeton.edu/java/15inout/
    public static void main(String[] args)  
    {
        System.out.println("START");
        //BasicTest();
		//Benchmark alfa=new Benchmark();
		long czas=WywolajBenchmark();
        System.out.println("KONIEC OK w czasie : " + czas + " ms");
    }
	
	private static long WywolajBenchmark()
        {
            long milliseconds = GetPointofTimeInMilliseconds();
			
			//
			//RunnableDemo R1 = new RunnableDemo( "Thread-1");
			
			Watek thread1 = new Watek();
			Watek thread2 = new Watek();
            
            thread1.run();
			thread2.run();
			//ThreadTest();
			long milliseconds2 = GetPointofTimeInMilliseconds() - milliseconds;

            return milliseconds2;
		}
		private static long GetPointofTimeInMilliseconds()
        {
            //return DateTimeOffset.Now.ToUnixTimeMilliseconds();
			return System.currentTimeMillis();
        }
		
}
	
	class Benchmark{
	private static void BasicTest()
        {
            // 10 LET W=500 : DIM F(W) : LET P=1 : LET A=3
            //int licznikP1 = 0;
            //int licznikP2 = 0;
            //int licznikP3 = 0;
            int varW = 500;
            int[] arrF = new int[500];
            int varP = 0;
            int varA = 3;
            int varX = 0;
            double varS = 0;

            //20 LET F(P)=A: LET P=P+1: IF P>W THEN STOP

            do
            {
                arrF[varP] = varA;
                //licznikP1++;
                varP++;

                //30 LET A=A+2:LET X=1
                do
                {
                    varA = varA + 2;
                    varX = 0;
                    //40 LET S=A/F(X):IF S=INT(S) THEN 30
                    varS = ((double)varA) / arrF[varX];
                    //licznikP2++;


                } while (varS == Truncate(varS));
                do
                {
                    //50 LET X=X+1:IF X<P AND F(X)*F(X)<=A THEN 40
                    //licznikP3++;
                    varX++;
                } while ((varX < varP) && ((arrF[varX] * arrF[varX]) <= varA));

            } while (varP < varW);
            //60 GOTO 20
            //Console.WriteLine("Amount of loops P1={0}, P2={1}, P3={2}",licznikP1,licznikP2,licznikP3);
        }

        private static double Truncate(double value)
        {
            return value - value % 1;
        }   
		
		
		
		
		
		
		
		public void ThreadTest()
        {
            for (int i = 0; i < 100000; i++)


            {
                try
                {
                    BasicTest();
                }
                catch (Exception e)
                {
                    //Console.WriteLine("Sypnelo sie :{0}", e);
					System.out.println("Sypnelo sie :"+ e);
				
                }
                //y=y+(i+1)^2;
            }
            //Console.WriteLine("#");

        }
}
		
	class Watek implements Runnable {
	public void run() {
		System.out.println("Jestem sobie zwyklym Watkiem implementujacym interfejs Runnable");    
		Benchmark alfa=new Benchmark();
		alfa.ThreadTest();
		}
	}

 