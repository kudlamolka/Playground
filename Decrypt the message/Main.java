#include<iostream>
int main()
{
  int a,b;
  std::cin>>a>>b;
  int add = a+b;
  int sum =0;
  for(int i=1;i<add;i++)
  {
    if(add%i==0)
      sum = sum + i;
  }
  if(sum == add)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}