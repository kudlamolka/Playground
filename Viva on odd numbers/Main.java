#include<iostream>
using namespace std;
int main()
{
  int count=0,input;
  float score = 0;
  do{
    cin>>input;
    if(input<0)
    {	score = score -1;
    	break;
    }
    else if(input%2==0)
      score = score - 0.5;
    else 
    {
      score = score+1;
      count = count+1;
    }
  }while(count<3);
    
   printf("%.1f",score);
}