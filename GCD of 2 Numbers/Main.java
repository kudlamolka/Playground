#include<iostream>
int waitTillO(int one,int two)
{
  int temp = two;
  two = one%two;
  one = temp;
  //std::cout<<one<<" "<<two<<"\n";
  if(two>0)
  {
    int GCD = waitTillO(one,two);
  	return GCD;
  }
  else
    return one;
}
int main()
{
  int one,two;
  
  std::cin>>one>>two;
  int o = one;
  int t = two;
  if(two>one)
  {
    int temp = one;
    one = two;
    two = temp;
  }
  int GCD = waitTillO(one,two);
  
  std::cout<<"G.C.D of "<<o<<" and "<<t<<" = "<<GCD;
}