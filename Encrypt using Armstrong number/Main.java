#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int back = n;
  	int count = 0;
  	while(back>0)
    {
      back/=10;
      count++;
    }
  	back = n;
  	int sum =0;
  	while(back>0)
    {
      int temp = back%10;
      sum += power(temp,count);
      back/=10;
    }
  //std::cout<<sum<<back;
  if(n==sum)
    return 1;
  else
    return 0;
      
      
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}