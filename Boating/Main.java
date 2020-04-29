#include<iostream>
using namespace std;
int main()
{
  int thres, ad,ch;
  std::cin>>thres>>ad>>ch;
  if(thres>(ad*75+ch*30))
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}