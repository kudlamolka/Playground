#include<iostream>

int main()
{
  int bacteria;
  int expo ;
  int required;
  std::cin>>bacteria>>expo>>required;
 	int whatweget=1;
  for(int i=0;i<expo;i++)
    whatweget *= bacteria;
  
  if(whatweget>=required)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}