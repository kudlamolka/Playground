#include<iostream>
int main()
{
   int thres, wgt;	
  	std::cin>>thres>>wgt;
  	if(wgt<thres)
      std::cout<<"Yes, you can enter.";
  	else if(wgt==thres)
      std::cout<<"Yes, you can enter. Kindly use a rope.";
  	else
      std::cout<<"Sorry, you can't enter";
}
      