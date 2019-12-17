#include <iostream>

using namespace std;

double   t,a,w,c;
double x,y,z;
int main()
{
    while(cin>>t>>a>>w>>c)
    {
        x=a/t;
        w=w/100;
        c=c/100;
        if(x<w)
        {
            cout<<"OK"<<endl;
        }
        else if(x>=w && x<c)
        {
            cout<<"warning"<<endl;
        }
        else
            {
            cout<<"critical"<<endl;
        }
        }

        //cout<<x;

    return 0;
}
