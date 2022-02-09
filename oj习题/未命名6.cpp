#include<iostream>
using namespace std;
int main(){
	int a,b,c;
	for(a = 1; a <7; a++)
		for(b = 0; b < 7; b++)
			for(c = 1; c < 7; c++)
			{
				if(a*49+b*7+c == c*81+b*9+a){
					printf("%d\n",a*49+b*7+c);
					printf("%d\n",a*100+b*10+c);
					printf("%d\n",c*100+b*10+a);
				}
			}
	return 0;
}

