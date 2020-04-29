#include<iostream>
using namespace std;
int main()
{
  int a,b,c,code;
  std::cin>>a>>b>>c;
  int max,min,box;
  if(a>b && a>c)
  	max = a;
  else if(b>a && b>c)
    max = b;
  else 
    max = c;
  
  if(a<b && a<c)
    min = a;
  else if(b<a && b<c)
    min = b;
  else
    min =c;
  
  if((max==a && min == b) || (max ==b && min==a))
    box = c;
  else if((max==b && min == c) || (max ==c && min==b))
    box = a;
  else
    box =b;
  
 	for(int i=1; i<=min;i++)
    {
      if(a%i==0 && b%i==0 && c%i==0)
      {
		code = i;
      }
    }
  cout<<"The treasure is in box which has number "<<box<<"\nThe code to open the box is "<<code;
      
  
}