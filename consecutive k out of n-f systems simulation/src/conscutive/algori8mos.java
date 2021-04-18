package conscutive;
import java.util.Random;

public class algori8mos {
	
			
	public static String lush(int n, int k) {
		int printcounter,i,j,size,z,thesis,t,cons_counter,failedComponents;
		size=n*10000;							
		double sum[]=new double[n],fails_in[]=new double[size],minvalue,newArray[]=new double[n];	
		int thesis_array[]=new int[size/n],numberOfC_array[]=new int[size/n];		
		printcounter=0;
		
		for(i=0;i<size;i++) {
			Random random = new Random();
			fails_in[i]= random.nextDouble();
			if(printcounter==n) {
				printcounter=0;
			}
			printcounter++;
		}
		
		t=0;
		for(i=0;i<size;i+=n) {					
			minvalue=1.0;					
			
			j=i;
			for(z=0;z<newArray.length;z++) {				
			
					newArray[z]=fails_in[j];
					j++;
				
			}
			System.out.println("O neos pinakas einai:");
			for(z=0;z<newArray.length;z++) {
				System.out.printf("%.3f|",newArray[z]);
			}
			System.out.println("");
			
			thesis=0;
			cons_counter=0;
			failedComponents=0;
			while(cons_counter<k){
				
				minvalue=1.0;								
				for(z=0;z<newArray.length;z++) {			 
					if(newArray[z]<minvalue ) {
						minvalue=newArray[z];				
					}
				}
				
				for(z=0;z<newArray.length;z++) {
				
					if(newArray[z]==minvalue ) {
						newArray[z]=10;
						failedComponents++;
						thesis=z;
						
					}
				}
			
				cons_counter=0;
				for(z=0;z<newArray.length;z++) {
					
					
				
					if(z==newArray.length-1) {
							
						if((newArray[z]==10)&&(newArray[z-1]==10 )&&(n==k)){
								cons_counter++;
						}
					}
					else if((newArray[z]==10)&&(newArray[z+1]==10)) {
								cons_counter++;
						}		
						
					else {
						cons_counter=0;
					}
					
					
					if((cons_counter>=k-1)&&(n!=k)){
						
						break;
					}
				
					
				}
				if((cons_counter>=k-1)&&(n!=k)){
					break;
				}
				
				
			}
			System.out.println("Fc:"+failedComponents);
			thesis_array[t]=thesis;
			numberOfC_array[t]=failedComponents;
			t++;
		}
		for(i=0;i<sum.length;i++) {							
			sum[i]=0.00;
			
		}
		System.out.println("Pinakas monadwn pou ka8orizoun to xrono zwhs tou ka8e susthmatos");
		for(i=0;i<numberOfC_array.length;i++) {
			
			System.out.printf("%d |",numberOfC_array[i]);
			sum[numberOfC_array[i]-1]=sum[numberOfC_array[i]-1]+1;
			
		}
		for(i=0;i<sum.length;i++) {							
			sum[i]=sum[i]/(size/n);								
		}
		System.out.println("\n Διάνυσμα υπογραφής:");
		for(i=0;i<sum.length;i++) {
			System.out.printf("%.3f |",sum[i]);
		}
		System.out.printf("");
		String s;
		s="|";
		for(i=0;i<sum.length;i++) {
			System.out.printf("%.3f |",sum[i]);
			
			s=s+sum[i]+" |";
		}
		System.out.println(s);
		return s;
	}
}