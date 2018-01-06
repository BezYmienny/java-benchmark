public class InitialsTh2
{
//http://introcs.cs.princeton.edu/java/15inout/
    public static void main(String[] args)  
    {
        System.out.println("START");
        //BasicTest();
		int ThreadAmount=0;
		if(args.length>0)
		{
		try{
		ThreadAmount=IfArgsIsInt(args[0]);
		}
		catch (Exception e)
		{
			System.out.println("Bledny parametr !!!" + e);
			ThreadAmount=1;
		}
		}
		else
		{
			System.out.println("Brak parametru - domyslnie 1th !!!" );
			ThreadAmount=1;
		}
		//Benchmark alfa=new Benchmark();
		long czas=WywolajBenchmark(ThreadAmount);
		Zapisz(ThreadAmount,czas);
        System.out.println("KONIEC OK w czasie : " + czas + " ms");
    }
	
	private static void Zapisz(int threadAmount,long czas)
	{
		// XXX
		
		FileOutputStream fout = null;
		try{
			fout = new FileOutputStream("test.txt");
			 }
		catch(FileNotFoundException e){
				 System.out.println("Błąd przy otwieraniu pliku.");
				 System.exit(-1);
			 }
		DataOutputStream out = new DataOutputStream(fout);

		BufferedReader inbr = new BufferedReader( new InputStreamReader(System.in));
		 try{
			 
			 out.writeBytes("Czas :"  + '\n');
			 }
		 }
		 catch(IOException e){
		 System.out.println("Read/Write error.");
		 }
		
		// XXX
	}
	
	private static int IfArgsIsInt(String arg0)
	{
		int IleWatkow=Integer.parseInt(arg0);
		return IleWatkow;
	}
	
	private static long WywolajBenchmark(int threads)
        {
            long milliseconds = GetPointofTimeInMilliseconds();
		
			
			
			Watek thread1 = new Watek();
			Watek thread2 = new Watek();
			Watek thread3 = new Watek();
			Watek thread4 = new Watek();
			Watek thread5 = new Watek();
			Watek thread6 = new Watek();
			Watek thread7 = new Watek();
			Watek thread8 = new Watek();
			Watek thread9 = new Watek();
			Watek thread10 = new Watek();
			Watek thread11 = new Watek();
			Watek thread12 = new Watek();
            if (threads == 1)
				System.out.println("Th: 1 only ");
			if (threads > 1)
			{
					(new Thread(thread1)).start();
					System.out.println("Th: 2");
					
			}
			if (threads > 2)
			{
					(new Thread(thread2)).start();
					System.out.println("Th: 3");
			}
			if (threads > 3)
			{
					(new Thread(thread3)).start();
					System.out.println("Th: 4");
			}
			if (threads > 4)
			{
					(new Thread(thread4)).start();
					System.out.println("Th: 5");
			}
			if (threads > 5)
			{
					(new Thread(thread5)).start();
					System.out.println("Th: 6");
			}
			if (threads > 6)
			{
					(new Thread(thread6)).start();
					System.out.println("Th: 7");
			}
			if (threads > 7)
			{
					(new Thread(thread7)).start();
					System.out.println("Th: 8");
			}
            //thread1.run();
			//thread2.run();
			
			thread12.run();
			
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
		System.out.println(" Thread ( heritage from  Runnable) ");    
		Benchmark alfa=new Benchmark();
		alfa.ThreadTest();
		}
	}

 