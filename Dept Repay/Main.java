#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  float d = (a*b*c)/100;
  
  std::cout<<d<<"\n";
  std::cout<<a+d<<"\n";
  std::cout<<(d*2)/100<<"\n";
  std::cout<<(a+d)-((d*2)/100);

}