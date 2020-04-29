#include<iostream>
using namespace std;
int main()
{
  int number;
  cin>>number;
  int oddSum=0,evenSum=0;
  while(number>0)
  {
    int temp = number%10;
    if(temp%2==0)
      evenSum+=temp;
    else
      oddSum+=temp;
    number/=10;
  }
  if(oddSum==evenSum)
    cout<<"Yes";
  else
    cout<<"No";
}