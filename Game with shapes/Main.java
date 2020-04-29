#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  if(b>=2*a)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
}