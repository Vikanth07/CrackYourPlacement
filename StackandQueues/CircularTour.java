package StackandQueues;

public class CircularTour {
    int tour(int petrol[], int distance[])
    {
	    int totalPetrol = 0;
	    int totalCost = 0;
	    for(int p : petrol){
	        totalPetrol+=p;
	    }
	    for(int c : distance){
	        totalCost+=c;
	    }
	    if(totalCost>totalPetrol)return -1;
	    int start = 0;
	    int curr = 0;
	    for(int i=0; i<distance.length; i++){
	        curr += petrol[i]-distance[i];
	        if(curr<0){
	            start = i+1;
	            curr = 0;
	        }
	    }
	    return start;
    }
}
