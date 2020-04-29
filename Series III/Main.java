#include<iostream>
int main()
{
  int length;
  std::cin>>length;
  int toAdd = 5;
  int first = 6;
  for(int i=0;i<length;i++)
  {
    std::cout<<first<<" ";
    first += toAdd;
    toAdd += 5;
  }
}