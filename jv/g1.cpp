//	263A - Beautiful Matrix
//	

#include<bits/stdc++.h>
using namespace std;
int main ()
{
    int i,j,x,y,a[10][10];
 
    for(i=1;i<=5;i++)
    {
        for(j=1;j<=5;j++)
        {
            cin>>a[i][j];
        }
       
    }
 
    for(i=1;i<=5;i++)
    {
        for(j=1;j<=5;j++)
        {
            if(a[i][j]==1)
            {  x=3-i;
                if(x<0){
                    x=-x;}
                 y=3-j;
                if(y<0){
                    y=-y;}
            }
        }}
 
   cout<<x+y;
 
 
 
    return 0;
}

/*
→Judgement Protocol
Test: #1, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
3
Answer
3
Checker Log
ok 1 number(s): "3"
Test: #2, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 1 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
1
Answer
1
Checker Log
ok 1 number(s): "1"
Test: #3, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0
0 0 0 0 0
Output
0
Answer
0
Checker Log
ok 1 number(s): "0"
Test: #4, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 1
Output
4
Answer
4
Checker Log
ok 1 number(s): "4"
Test: #5, time: 0 ms., memory: 4 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 1 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
3
Answer
3
Checker Log
ok 1 number(s): "3"
Test: #6, time: 0 ms., memory: 4 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
1 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
4
Answer
4
Checker Log
ok 1 number(s): "4"
Test: #7, time: 0 ms., memory: 4 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 1 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
2
Answer
2
Checker Log
ok 1 number(s): "2"
Test: #8, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 1 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
3
Answer
3
Checker Log
ok 1 number(s): "3"
Test: #9, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
4
Answer
4
Checker Log
ok 1 number(s): "4"
Test: #10, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
1 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
3
Answer
3
Checker Log
ok 1 number(s): "3"
Test: #11, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 1 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
2
Answer
2
Checker Log
ok 1 number(s): "2"
Test: #12, time: 0 ms., memory: 8 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
1
Answer
1
Checker Log
ok 1 number(s): "1"
Test: #13, time: 30 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 1 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
2
Answer
2
Checker Log
ok 1 number(s): "2"
Test: #14, time: 0 ms., memory: 4 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
1 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output
2
Answer
2
Checker Log
ok 1 number(s): "2"
Test: #15, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 1 0
0 0 0 0 0
0 0 0 0 0
Output
1
Answer
1
Checker Log
ok 1 number(s): "1"
Test: #16, time: 30 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0
Output
2
Answer
2
Checker Log
ok 1 number(s): "2"
Test: #17, time: 0 ms., memory: 8 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
1 0 0 0 0
0 0 0 0 0
Output
3
Answer
3
Checker Log
ok 1 number(s): "3"
Test: #18, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 1 0 0 0
0 0 0 0 0
Output
2
Answer
2
Checker Log
ok 1 number(s): "2"
Test: #19, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0
Output
1
Answer
1
Checker Log
ok 1 number(s): "1"
Test: #20, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 1 0
0 0 0 0 0
Output
2
Answer
2
Checker Log
ok 1 number(s): "2"
Test: #21, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
Output
3
Answer
3
Checker Log
ok 1 number(s): "3"
Test: #22, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
1 0 0 0 0
Output
4
Answer
4
Checker Log
ok 1 number(s): "4"
Test: #23, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 1 0 0 0
Output
3
Answer
3
Checker Log
ok 1 number(s): "3"
Test: #24, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
Output
2
Answer
2
Checker Log
ok 1 number(s): "2"
Test: #25, time: 0 ms., memory: 0 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 1 0
Output
3
Answer
3
Checker Log
ok 1 number(s): "3"

*/