#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str;
  int rail;
  getline(cin,str);
  cin>>rail;
  int cmp = str[0];
  if(cmp==102)
  {
     if(rail==1)
    	cout<<"Left Handed";
 	else
     cout<<"Right Handed";
  }
  else
  {
    if(rail==1)
        cout<<"Right Handed";
   	else
    cout<<"Left Handed";
  }
}