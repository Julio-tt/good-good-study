#include<iostream>
#include<cstdio>
using namespace std;
int main(){
    int m,n,x;
	cin >> m >> n >> x;
	int M = 0;              //��ʼ����ֵΪ0 
	for(int i=0;i<x;i++){   //����Ԫ�� �ָ����� 
		M += n;             //������Ԫ�ػָ����� 
		if(M>=m){           //�ָ���� 
			n+=m/n; /*��Ӷ��ÿ����ս��n�죬ս�����ͻ�����1��
			      ����ս������Ϊm*/ 
			M=0;//����������Ϊ0 
		}
	}
	cout << n ;
		return 0;
} 
