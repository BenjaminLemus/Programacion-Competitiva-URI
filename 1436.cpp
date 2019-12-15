#include <iostream>

using namespace std;
int n;
int main()
{
    int m;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cin>>m;
        int vec[m];
        for(int j=0;j<m;j++)
        {
            cin>>vec[j];
        }
        m=m/2;
        //cout<<m<<endl;
        cout<<"Case "<<i+1<<": ";
        cout<<vec[m]<<endl;
    }

    return 0;
}
