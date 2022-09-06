//4B - Before an Exam

#include <bits/stdc++.h>
#define f first
#define s second
using namespace std;
int main() {
    int n,h;
    cin>>n>>h;
 
    vector<pair<int,int>> v(n);
    int mini=0;
    int maxi=0;
    for(auto &x:v){
        int a,b;
        cin>>a>>b;
        x={a,b};
        mini+=a;
        maxi+=b;
    }
 
    if(mini<=h && h<=maxi){
        vector<int> ans;
 
        for(auto x:v){
            ans.push_back(x.f);
            h-=x.f;
        }
        int i=0;
 
        while(h>0 && i<n){
            int delta=min(h,v[i].s-v[i].f);
            ans[i]+=delta;
            h-=delta;
            i++;
        }
        cout<<"YES"<<endl;
        for(auto x:ans) cout<<x<<" ";
        cout<<endl;
 
 
        
    }
 
 
 
 
 
 
 
 
 
 
 
    else cout<<"NO"<<endl;
 
 
    return 0;
}

/*
→Judgement Protocol
Test: #1, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
1 48
5 7
Output
NO
Answer
NO
Checker Log
ok Days = 1, answer = NO
Test: #2, time: 15 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
2 5
0 1
3 5
Output
YES
1 4 
Answer
YES
1 4 
Checker Log
ok Days = 2, answer = YES
Test: #3, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
1 1
5 6
Output
NO
Answer
NO
Checker Log
ok Days = 1, answer = NO
Test: #4, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
1 4
2 4
Output
YES
4 
Answer
YES
4 
Checker Log
ok Days = 1, answer = YES
Test: #5, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
2 5
4 6
0 0
Output
YES
5 0 
Answer
YES
5 0 
Checker Log
ok Days = 2, answer = YES
Test: #6, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
27 97
2 8
0 5
5 6
3 6
5 5
1 2
3 5
1 8
0 4
3 3
0 2
0 0
4 8
5 6
5 8
0 7
1 4
0 4
1 5
3 7
2 5
5 6
4 7
3 8
0 1
3 4
5 7
Output
YES
8 5 6 6 5 2 5 8 4 3 2 0 6 5 5 0 1 0 1 3 2 5 4 3 0 3 5 
Answer
YES
8 5 6 6 5 2 5 8 4 3 2 0 6 5 5 0 1 0 1 3 2 5 4 3 0 3 5 
Checker Log
ok Days = 27, answer = YES

*/