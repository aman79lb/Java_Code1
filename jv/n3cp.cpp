/*
 * @Author: CasseShimada
 * @Bilibili: https://space.bilibili.com/11560185
 * @Date: 2022-08-04 18:53:44
 * @LastEditTime: 2022-08-04 18:54:44
 * Copyright (c) 2022 by CasseShimada, All Rights Reserved. 
 */
// #include <algorithm>
// #include <cstring>
// #include <iostream>
// #include <map>
// #include <queue>
// #include <stdio.h>
#include <bits/stdc++.h>
using namespace std;
// #define INF
#define N 100001
// #define MOD
 
// const int MXint = numeric_limits<int>::max();
// const long long MXint64 = numeric_limits<long long>::max();
// const double MXdouble = numeric_limits<double>::max();
 
// ofstream fout;
int t, n, x;
long long y;
// int arr[N];
 
int main()
{
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    // cout << setiosflags(ios::fixed) << setprecision(2); 
    // fout.open("out.txt",ios::out);
    cin >> t;
    while(t--)
    {
        bool flag = false;
        cin >> n >> x >> y;
        if((x&1) == (y&1)) flag = true;
        for(int i = 1; i <= n; i++)
        {
            int tmp;
            cin >> tmp;
            if(tmp&1) flag = !flag;
            // cerr << "tmp&1 = " << (tmp&1) << '\n';
        }
        if(flag) cout << "Alice\n";
        else cout << "Bob\n";
        // cerr << '\n';
    }
    // fout.close();
    return 0;
}

//1634B - Fortune Telling