#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int print = 1;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      std::cout<<print;
      if(j<i)
        std::cout<<"*";
    }
    print++;
    std::cout<<"\n";
  }
  for(int i=n;i>=1;i--)
  {
    print--;
    for(int j=1;j<=i;j++)
    {
      std::cout<<print;
      if(j<i)
        std::cout<<"*";
    }
    std::cout<<"\n";
  }
}