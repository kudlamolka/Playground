#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if(n<=r || n>=((r*c)-r+1) || n%r==1)
    cout<<"Yes";
  else
    cout<<"No";
}