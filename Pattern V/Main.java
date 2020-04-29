#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int first = 1;
  int last = n*(n+1);
  for(int i=0;i<n;i++)
  {
	for(int j=0;j<(i*2);j++)
    {
      cout<<"-";
    }
    int value = n-i;
    for(int j=0;j<value;j++)
    {
      cout<<first<<"*";
      first++;
    }
    last = last-value+1;
    for(int j=0;j<value;j++)
    {
      if(j==value-1)
        cout<<last;
      else
        cout<<last<<"*";
      last++;
    }
    last = last - value - 1;
    cout<<"\n";
  }
}
      