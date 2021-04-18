package constrained;
import java.util.Random;

public class algori8mos {
	
			
	public static String lush(int n, int k,int d) {
		int printcounter,megmhden,r,i,j,size,z,t,failedComponents;
		int ep,dis,countens;
		size=n*10000;							
		double sum[]=new double[n],fails_in[]=new double[size],minvalue,newArray[]=new double[n];	
		int numberOfC_array[]=new int[size/n];		
		int tn[]=new int[n],apostaseis[]=new int[n*10];
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
		for(ep=0;ep<size;ep+=n) {									
			j=ep;
			for(z=0;z<newArray.length;z++) {				
			
					newArray[z]=fails_in[j];
					j++;
				
			}
			System.out.println("O neos pinakas einai:");
			for(z=0;z<newArray.length;z++) {
				System.out.printf("%.3f|",newArray[z]);
			}
			System.out.println("");
			
			failedComponents=0;
			r=0;
			for(i=0;i<tn.length;i++) {
				tn[i]=-1;
			}
		outerloop:{
			while(failedComponents<k){
				
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
						tn[r]=z;
						r++;
						
					}
					
				}
				System.out.print("tn=");
				for(i=0;i<tn.length;i++) {
					System.out.printf("|"+tn[i]);
				}
				System.out.println("");
				megmhden=0;
				for(i=0;i<tn.length;i++) {
					if(tn[i]!=-1) {
						megmhden++;
					}
				}
				if(megmhden>=2) {
				dis=0;
				 for(i=0;i<tn.length;i++){
		             for(j=i+1;j<tn.length;j++){
		            	 countens=0;
		            	if((tn[i]!=-1)&&(tn[j]!=-1)) {
		            		if(tn[j]<tn[i]) {
		            			for(z=tn[j]+1;z<tn[i];z++) {
		            				if(newArray[z]==10)
		            					countens++;
		            			}
		            			 System.out.println("Meta3u ths "+(i+1)+"hs apotuxhmenhs monadas kai ths "+(j+1)+"hs apotuxhmenhs monadas mesolavoun "+(((tn[i]-tn[j])-1)-countens)+" leitourgikes monades");
		            			apostaseis[dis]=(((tn[i]-tn[j])-1)-countens);
		            		 	System.out.println("leitourgoun anamesaa:"+apostaseis[dis]);
		            		 	if(apostaseis[dis]<d) {
		            		 		System.out.println("Breaking");
			 						break outerloop ;
			 					}
		            		 	dis++;
		            		 	
		            		 }
		            	 
		            		else if(tn[j]>tn[i]) {
		            			for(z=tn[i]+1;z<tn[j];z++) {
		            				if(newArray[z]==10)
		            					countens++;
		            			}
		            			 System.out.println("Meta3u ths "+(i+1)+"hs apotuxhmenhs monadas kai ths "+(j+1)+"hs apotuxhmenhs monadas mesolavoun "+(((tn[j]-tn[i])-1)-countens)+" leitourgikes monades");
		            			apostaseis[dis]=(((tn[j]-tn[i])-1)-countens);
		            			System.out.println("leitourgoun anamesab:"+apostaseis[dis]);
		            			if(apostaseis[dis]<d) {
		            				System.out.println("Breaking");
		            				break outerloop ;
		            			}
		            			dis++;
		            			
		            		}
		            	}               
		             }
				 }		
			}	
		
      }
	}
			System.out.println("Fc:"+failedComponents);
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

