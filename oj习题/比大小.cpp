#include <iostream>
#include <iomanip>
using namespace std;
int main(){
	int n,max=0;
	while(scanf("%d",&n)!=EOF){
		if(n>max)
		max=n;
	}
	printf("%d",max);
	    return 0;
}

