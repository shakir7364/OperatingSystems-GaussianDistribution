package guassianDistribution;

import java.util.Random;

public class GuassianDistribution 
{
	private static int loopK = 1000;

	public static void main(String[] args) 
	{
		Random r1 = new Random();
		// check next Gaussian value  
		   
		float pct5 = 0;
		float pct10 = 0;
		float pct15 = 0;
		float pct20 = 0; 
		float pct50 = 0;
		
		for (int ii=0; ii<loopK; ii++)
		{ 
			double d1	= r1.nextGaussian() ;
			if (d1 >= 1.645)
				pct5++ ;
			else
				if((d1 >= 1.0365) && (d1 < 1.645))
					pct10++;
				else if((d1 >= 0.5245) && (d1 < 1.0365))
					pct15++;
				else if ((d1 >= 0) && (d1 < 0.5245))
					pct20++;
				else
					pct50++;
			   
			System.out.printf("Gaussian value: %f\n",d1);
		}
		   
		//System.out.println("Values of pcts: \npct10: " + pct10 + "\npct20: " + pct20 + "\npct50: " + pct50 + "\n");
		
		System.out.printf	("\n=====\n5pct: %.3f\t 10pct: %.3f\t 15pct: %.3f\t 20pct: %.3f\t 50pct: %.3f\n====="
				,pct5/loopK*100
				,pct10/loopK*100
				,pct15/loopK*100
				,pct20/loopK*100
				,pct50/loopK*100);
	}
}
