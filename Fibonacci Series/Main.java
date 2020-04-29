#include<iostream>
int fibo(int f,int s,int pos)
{
  int temp = f;
  f = s+f;
  s=temp;
  pos--;
  //std::cout<<f<<" "<<s<<"\n";
  if(pos>0)
  {
    //std::cout<<pos<<"  ";
    int number = fibo(f,s,pos);
    //std::cout<<number<<"\n";
    return number;
  }
  return s;
    
}
int main()
{
  int pos;
  std::cin>>pos;
  int number = fibo(0,1,pos);
  std::cout<<"The term "<<pos<<" in the fibonacci series is "<<number;
}