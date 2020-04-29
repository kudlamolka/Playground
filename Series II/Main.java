#include<iostream>
int main()
{
  int length;
  std::cin>>length;
  int toAdd = 104;
  int first = 121;
  for(int i=0;i<length;i++)
  {
    std::cout<<first<<" ";
    first += toAdd;
    toAdd += 32;
  }
}