#include<iostream>
#include<cstdio>
using namespace std;
int main(){
    int m,n,x;
	cin >> m >> n >> x;
	int M = 0;              //初始体力值为0 
	for(int i=0;i<x;i++){   //能量元素 恢复体力 
		M += n;             //用能量元素恢复体力 
		if(M>=m){           //恢复完毕 
			n+=m/n; /*雇佣兵每连续战斗n天，战斗力就会上升1点
			      这里战斗天数为m*/ 
			M=0;//结束后体力为0 
		}
	}
	cout << n ;
		return 0;
} 
