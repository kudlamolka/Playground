#include<iostream>
using namespace std;
int power(int a,int n)
{
  if(n-->0)
    return a*power(a,n);
  else
    return 1;
}
int main()
{
  int a,n;
  cout<<"Enter the value of a\nEnter the value of n\n";
  cin>>a>>n;
  int answer = power(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<answer;
}