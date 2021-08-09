#include<bits/stdc++.h>
using namespace std;

int main()
{
	string str="101101101";
	cout<<str<<endl;
	int i,j,m,temp=0;
	int str1[100];
	m=str.length();
	for(i=0;i<m;i++)
	{
		if(str[i]=='0')
		{
			str1[i]=0;
		}
		else if(str[i]=='1')
		{
			if(temp==0)
			{
				temp=1;
				str1[i]=1;
			}
			else if(temp==1)
			{
				temp=-1;
				str1[i]=-1;
			}
			else if(temp==-1)
			{
				temp=1;
				str1[i]=1;
			}
		}
	}
	for(i=0;i<m;i++)
	{
		cout<<str1[i];
	}
	cout<<endl;
}

