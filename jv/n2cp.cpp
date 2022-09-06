#include<bits/stdc++.h>
using namespace std;
 
#define ll long long int
#define pb push_back
#define endl '\n'
#define read(v)  for(ll i=0;i<v.size();i++){cin>>v[i];}
#define write(v) for(ll i=0;i<v.size();i++) {cout<<v[i]<<" ";}
#define loop(v) for(auto it:v)
#define vi vector<int>
#define vl vector<ll>
#define f(i,a,b) for(ll i=a;i<b;i++)
#define all(v)   v.begin(),v.end()
#define rall(v)   v.rbegin(),v.rend()
struct node{
 
};
void solve()
{
        int n,p,x,ans=0,i=0;
        cin>>n>>p;
        vector<int>a(n);
        read(a);
        while(i<n)
        {
            if(a[i]>=a[p-1]&&a[i]>0){ans++;}
            i++;
        }
        cout<<ans;
}
 
int main()
{
    
 
    //ll T;cin>>T;
    //for(ll i=0;i<T;i++)
    {
        // cout<<"Case #"<<i+1<<": ";
        solve();
    }
}