#include<iostream>
using namespace std;
int main()
{
  int length;
  cin>>length;
  int first = 2;
  int toAdd = 6;
  for(int i=0;i<length;i++)
  {
    if(i==0)
      cout<<"0 ";
    else
    {
      cout<<first<<" ";
      first += toAdd;
      if(i!=1 && i%2==0)
        toAdd += 4;;
    }
  }
}