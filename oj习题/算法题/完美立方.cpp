#include <stdio.h> 
int main()
{
	int count = 0;
	int N;
	scanf("%d",&N);
	  for(int a = 2; a <= N; a++)
        for(int b = 2; b < a; b++) 
		 for(int c = 2; c < a; c++) 
		  for(int d = 2; d < a; d++)
		   if(a*a*a == b*b*b + c*c*c + d*d*d){
		     count++;
		     printf("Cube = %d,Tripe = (%d,%d,%d)\n",a,b,c,d);
			 }
			 printf("%d",count);
	return 0;		  
}
