#include<iostream>
using namespace std;
int main()
{
  int items;
  float time;
  cin>>items>>time;
  switch(items)
  {
    case 1: time *= 1;
      break;
    case 2: time*=1.5;
      break;
    case 3: time*=2;
      break;
    default: break;
  }
  if(items<4)
  printf("%.2f",time);
  else
    cout<<"Number of items is more";
}