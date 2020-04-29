#include<iostream>
int main()
{
  int number;
  std::cin>>number;
  int count = 0;
  for(int i=1;i<=number;i++)
  {
    if(number%i==0)
      count = count +1;
  }
  if(count !=2)
    std::cout<<"Not eligible";
  else
    std::cout<<"Eligible";
}