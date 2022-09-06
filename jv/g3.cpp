//151A - Soft Drinking
//
#include <bits\stdc++.h>
using namespace std;
int nero[1000000] = { 0 };
void sp() 
{
	std::ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
}
int main()
{
	sp();
	int n, b, l, a, p, s, nl, ns;
	cin >> n >> b >> l >> a >> p >> s >> nl >> ns;
	int bl = b * l / nl;
	int ap = a * p;
	int x = s / ns;
	cout << min(min(x, ap), bl)/n << endl;
}

/*
→Judgement Protocol
Test: #1, time: 0 ms., memory: 3916 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
3 4 5 10 8 100 3 1
Output
2
Answer
2
Checker Log
ok answer is 2
Test: #2, time: 30 ms., memory: 3916 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
5 100 10 1 19 90 4 3
Output
3
Answer
3
Checker Log
ok answer is 3
Test: #3, time: 0 ms., memory: 3912 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
10 1000 1000 25 23 1 50 1
Output
0
Answer
0
Checker Log
ok answer is 0
Test: #4, time: 0 ms., memory: 3920 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
1 7 4 5 5 8 3 2
Output
4
Answer
4
Checker Log
ok answer is 4
Test: #5, time: 0 ms., memory: 3916 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
2 3 3 5 5 10 1 3
Output
1
Answer
1
Checker Log
ok answer is 1
Test: #6, time: 0 ms., memory: 3920 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
2 6 4 5 6 5 1 3
Output
0
Answer
0
Checker Log
ok answer is 0
Test: #7, time: 0 ms., memory: 3912 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
1 7 3 5 3 6 2 1
Output
6
Answer
6
Checker Log
ok answer is 6
Test: #8, time: 0 ms., memory: 3916 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
2 4 5 4 5 7 3 2
Output
1
Answer
1
Checker Log
ok answer is 1
Test: #9, time: 0 ms., memory: 3916 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
2 3 6 5 7 8 2 1
Output
4
Answer
4
Checker Log
ok answer is 4
Test: #10, time: 0 ms., memory: 3916 KB, exit code: 0, checker exit code: 0, verdict: OK
Input
1 4 5 5 3 10 3 1
Output
6
Answer
6
Checker Log
ok answer is 6
Te
 */