#include<iostream>
using namespace std;
//½Ç¹È²ÂÏë  
int main()
{
    int n;
    cin>>n;
    if(1<n&&n<=2000000)
    do
    {
        if(n%2==1)
        {
            cout<<n<<"*3+1="<<n*3+1<<endl;
            n=n*3+1; 
        }
        else
        {
            cout<<n<<"/2="<<n/2<<endl;
            n=n/2;
        }
    }while(n!=1);
    cout<<"End";
    return 0;
}

