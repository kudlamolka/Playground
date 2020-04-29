#include<iostream>
using namespace std;
int sumit(int number)
{
  int sum=0;
  while(number>0)
  {
    sum += number%10;
    number = number/10;
  }
  return sum;
}
int main()
{
  int number;
  cin>>number;
  while(number/10>0)
    number = sumit(number);
  cout<<number;
}