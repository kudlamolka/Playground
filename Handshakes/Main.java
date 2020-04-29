#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int hs = 0;
  for(int i=1;i<n;i++)
   	hs +=i;
  cout<<hs;
}