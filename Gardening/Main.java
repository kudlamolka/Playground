#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r>>c>>n;
  int s1,e1,s2,e2;
  s1 = r+1;
  e1 = r+r;
  s2 = r*c-2*r+1;
  e2 = r*c-r;
  if( (n>=s1 && n<=e1) || (n>=s2 && n<=e2))
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
    
}