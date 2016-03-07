int[] A = {2,3,412,12,23,5,63,124,54,12,43,541,1,34} ;

	
	for (int i=2; i<=A.length; i++){
		
		int j=i;
int key=A[j];
 
 for ( j=i-1; j>0 ; j++){
 

if (A[j+1] < A[j] ) {

A[j] = A[j-1];
j=j-1;

 A[j]= key ;} } }
 
 
 for(int m=0; m< A.length; m++){
			System.out.print("final for loop ");
 System.out.print(A[m] +", "); }
 
 System.out.println(A); 
 
 