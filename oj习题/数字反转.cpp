#include<iostream>
#include<cstdio>
using namespace std;
int main(){
int n,t=0;
cin>>n;
if(n<0){
	n = -n;
	cout<<"-";
}
while(n!=0){
	t=t*10+n%10;
	n=n/10;
}
cout<<t; 
	return 0;
} 
