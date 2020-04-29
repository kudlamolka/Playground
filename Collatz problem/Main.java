#include<iostream>
using namespace std;
int main()
{
  int first;
  cin>>first;
  int count=0;
  while(first!=1)
  {
    cout<<first<<"\n";
    count++;
    if(first%2==0)
      first/=2;
    else
      first = first*3 + 1;
   }
  cout<<first<<"\n";
  cout<<count;
    
}