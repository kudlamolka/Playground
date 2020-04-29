#include<iostream>
using namespace std;
int main()
{
  int x,y=0;
  std:: cin>>x;
  y += x%10;
  x /=1000;
  y +=x%10;
  std::cout<<y;
}