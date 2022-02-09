#include<iostream>
#include<cstdio>
using namespace std;
int main(){
	int L,R,k,sum = 0;
	cin>>L>>R;
	for(int i = L;i<=R;++i){
		k=i;
		while(k>0){
			if(k%10==2)
			sum++;
			k=k/10;
		}	 
	}
	cout<<sum;
	return 0;
}
