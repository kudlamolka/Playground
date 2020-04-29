#include<iostream>
int main()
{
    int r,c;
 	std::cin>>r>>c;
  	int num;
  	int b[c][r];
  	for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        std::cin>>num;
        b[j][i] = num;
      }
    }
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      std::cout<<b[i][j]<<" ";
    }
    std::cout<<"\n";
  }
     
}