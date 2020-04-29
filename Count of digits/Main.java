#include<iostream>
int main()
{
  int x;
  std::cin>>x;
  int count = 0;
  do
  {
	count+=1;
    x/=10;
  }while(x>0);
    std::cout<<count;
}