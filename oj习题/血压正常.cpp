#include<iostream>
#include<cstdio>
using namespace std;
int main(){
	//���㲡��Ѫѹ������������Сʱ�� 
int n,a,b,c=0,d=0;
cin>>n;
for(int i = 0;i<n;++i){
	cin>>a>>b;
	if(a>=90&&a<=140&&b>=60&&b<=90){
		c++;
		if(c>=d){
			d = c;
		}
	}
	else
	c = 0;
}
cout<<d;
	return 0;
} 
