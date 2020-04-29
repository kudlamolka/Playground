#include <iostream>
using namespace std;
int main() {
    int n;
 	cin>>n;
  	int print = 0;
  	for(int i=1;i<=n;i++)
    {
      print++;
      int lineType = i%2;
      for(int j=1;j<=n;j++)
      {
        if(lineType==1)
        {
          
          cout<<print;
          if(j==n-1)
            print++;
        }
      	else
        {
          cout<<print;
          if(j==1)
            print--;
        }
      }
      cout<<"\n";
    }
}