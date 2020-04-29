#include<iostream>
using namespace std;
int main()
{
  int balls,target,runs,ballsBowled;
  std::cin>>balls>>target>>runs>>ballsBowled;
  int totalOvers = balls/6;
  std::cout<<totalOvers<<"\n";
  
  int overs = ballsBowled/6; 
  int overBalls = ballsBowled%6;
  float toDivide;
  switch(overBalls)
  {
    case 0: toDivide = overs;
      break;
      case 1: toDivide = overs+0.1;
      break;
      case 2: toDivide = overs+0.2;
      break;
      case 3: toDivide = overs+0.3;
      break;
      case 4: toDivide = overs+0.4;
      break;
      case 5: toDivide = overs+0.5;
      break;
  }
  std::cout<<int(ballsBowled/6)<<"."<<int(ballsBowled%6)<<"\n"; 
  float rr = float(float(target)/totalOvers);
  float crr = float(float(runs)/toDivide);
  printf("%.1f\n%.1f\n",crr,rr);
  if(crr>rr)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
  
  
}