#include<iostream>
int fact(int number)
{
  if(number==0)
    return 1;
  else
    return number*fact(number-1);
}
int main()
{
  int number;
  std::cin>>number;
  int answer = fact(number);
  std::cout<<"The factorial of "<<number<<" is "<<answer;
}