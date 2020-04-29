#include<iostream>
using namespace std;
int main()
{
  int number;
  cin>>number;
  int numberBack = number;
  number = number*number;
  int temp = number;
  int length = 0;
  while(temp>0)
  {
    length +=1;
    temp/=10;
  }
  int lowerLen = length/2;
  if(length%2!=0)
    lowerLen+=1;
  int lowerSum = 0;
  for(int i=0;i<lowerLen;i++)
  {
    lowerSum = lowerSum * 10 + number%10;
    number = number/10;
  }

  int lowerNumber = 0;
  for(int i=0;i<lowerLen;i++)
  {
    lowerNumber = lowerNumber * 10 + lowerSum%10;
    lowerSum /= 10;
  }

  int upperSum = lowerNumber + number;
  if(upperSum==numberBack)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
 
    
    
}