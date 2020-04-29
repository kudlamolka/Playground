#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int print = 1;
  for(int i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      print = print + i;
    }
    else
    {
      print = print + i - 1;
    }
    for(int j=1;j<=i;j++)
    {
      std::cout<<print;
      if(j<i)
      {
        if(i%2==0)
        	print--;
        else
          print++;
        std::cout<<"*";
      }
    }
    std::cout<<"\n";
  }
}
   