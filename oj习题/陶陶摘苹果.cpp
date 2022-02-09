#include<iostream>
#include<cstdio>
using namespace std;
int main(){
//	freopen("C:\\Users\\Julio\\Desktop\\test.txt","r",stdin);
	int a[10];
	int h,sum = 0;
    for(int i = 0;i<10;++i){
    	cin>>a[i];
	}
	cin>>h;
	for( int i = 0;i<10;++i){
		if(a[i]<=h+30)
		sum++;
	}
	cout<<sum;
	return 0;
}
