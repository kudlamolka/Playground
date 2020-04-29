#include<iostream>
using namespace std;
int main()
{
    int length;
  	cin>>length;
  	int first = 121;
  	int toAdd = 104;
  	for(int i=0; i<length; i++)
    {
      cout<<first<<" ";
      first += toAdd;
      toAdd += 32;
    }
}
