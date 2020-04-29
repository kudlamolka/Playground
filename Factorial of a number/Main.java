#include<iostream>
int main(){
  int n;
  std::cin>>n;
  int fact = 1;
  for(int i=2;i<=n;i++)
  {
    fact *=i;
  }
  std::cout<<fact;
    
}