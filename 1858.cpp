#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int n;
    cin>>n;
    int vec[n],vecx[n];
    int i;
    for(i=0;i<n;i++){cin>>vec[i];vecx[i]=vec[i];}
    sort(vecx, vecx+n);
    for(i=0;i<n;i++)
    {
        if(vecx[0]==vec[i])
        {
            cout<<i+1<<endl;
            break;
        }
    }

    return 0;
}
