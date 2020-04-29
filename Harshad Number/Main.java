#include<iostream>
using namespace std;
int main()
{
  int numb,back;
  cin>>numb;
  back = numb;
  int sum=0;
  while(numb>0)
  {
    sum = sum + numb%10;
    numb = numb/10;
  }
  if(back%sum == 0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}