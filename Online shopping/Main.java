#include<iostream>
using namespace std;
int main()
{
  int fkp,fkd,fks,azp,azd,azs,sdp,sdd,sds;
  cin>>fkp>>fkd>>fks>>azp>>azd>>azs>>sdp>>sdd>>sds;
  int fkf,azf,sdf;
  fkf = (fkp - ((fkp*fkd)/100) + fks);
  azf = (azp - ((azp*azd)/100) + azs);
  sdf = (sdp - ((sdp*sdd)/100) + sds);
  std::cout<<"In Flipkart Rs."<<fkf;
  std::cout<<"\nIn Snapdeal Rs."<<azf;
  std::cout<<"\nIn Amazon Rs."<<sdf;
  if(fkf>azf)
  {
    if(sdf>azf)
    {
      cout<<"\nHe will prefer Snapdeal";
    }
    else
    {
      cout<<"\nHe will prefer Amazon";
    }
  }
  else
  {
    if(sdf>fkf)
    {
      cout<<"\nHe will prefer Flipkart";
    }
    else
    {
      cout<<"\nHe will prefer Amazon";
    }
  }
    
}