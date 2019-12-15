#include <iostream>

using namespace std;

int main()
{
    float d,vf,vg,df;
    while(cin>>d>>vf>>vg)
    {
        if(vf>=vg)
            {cout<<"N"<<endl;}
        else if(d>12){cout<<"N"<<endl;}
        else
        {
            float tg,tf;
            df=12-d;
            tf=df/vf;

            tg=12/vg;
            cout<<tf<<" "<<tg<<endl;
            if(tf<tg)
                {cout<<"S"<<endl;}
            else
                {cout<<"N"<<endl;}
        }
    }
    return 0;
}
