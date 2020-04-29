#include<iostream>
int main()
{
  int length;
  std::cin>>length;
  double first = 0.5;
  int toAdd = 1;
  for(int i=0;i<length;i++)
  {
    std::cout<<first<<" ";
    first += toAdd;
    toAdd *= 3;
  }
}