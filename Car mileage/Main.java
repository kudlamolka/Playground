#include<iostream>
using namespace std;
int main()
{
  int petrol,distance;
  float mileage;
  std::cin>>mileage>>petrol>>distance;
  float canCover = mileage * petrol;
  if(canCover>=distance)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}