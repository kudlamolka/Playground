#include<iostream>
using namespace std;
int main()
{
  int month;
  cin>>month;
  int a=0,b=1;
  if(month==1)
    cout<<a;
  else if(month == 2)
    cout<<b;
  else
  {
    for(int i=1;i<month;i++)
    {
      int temp = a;
      a = a+b;
      b = temp;
    }
    cout<<a;
  }
}