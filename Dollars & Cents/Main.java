#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2;
  cin>>d1>>c1>>d2>>c2;
  int td,tc;
  td = d1+d2;
  tc = (c1+c2)%100;
  td = td+(c1+c2)/100;
  cout<<td<<"\n"<<tc;
}