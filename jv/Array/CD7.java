import java.util.*;
//problems/LOSTSEQ
class CD6
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        int t= Integer.parseInt(inp.readLine());
        StringTokenizer st;
        //st = new StringTokenizer(inp.readLine());
        
        while(t-->0)
        {
            int n = Integer.parseInt(inp.readLine());
            st = new StringTokenizer(inp.readLine());
            int b[] = new int[2*n];
            int sum=0;
            for (int i=0; i<2*n; i++) {
                b[i] = Integer.parseInt(st.nextToken());
                sum += b[i];
            }
            
            if(sum%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
          
          //  t--;
        }
    }
}