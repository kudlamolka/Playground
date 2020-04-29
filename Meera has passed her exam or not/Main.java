#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int my;
  int flag = 0;
  std::cin>>my;
  for(int i=0;i<n;i++)
  {
    if(a[i] == my)
    {	
      flag=1;
      break;
    }
  }
  if(flag==1)
  {
    std::cout<<"She passed her exam";
  }
  else
  {
    std::cout<<"She failed";
  }
    
}