#include<iostream>
int main()
{
  int number;
  std::cin>>number;
  for(int i=1;i<=4;i++)
  {
    for(int j=1;j<=i;j++)
    {
      std::cout<<number;
    }
    number++;
    std::cout<<"\n";
  }
  for(int i=4;i>=1;i--)
  {
    number--;
    for(int j=1;j<=i;j++)
    {
      std::cout<<number;
    }
    std::cout<<"\n";
  }
}