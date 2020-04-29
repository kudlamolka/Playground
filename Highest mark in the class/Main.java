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
  for(int i=0;i<n-1;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(a[i]<a[j])
      {
        int temp = a[i];
        a[i]=a[j];
        a[j] = temp;
      }
    }
  }
  std::cout<<a[0];
}