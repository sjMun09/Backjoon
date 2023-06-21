import java.io.*;
import java.util.*;
class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][]points = new int[N][2];
        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(points, Comparator
                         .comparingInt((int[] point) -> point[0])
                         .thenComparingInt(point -> point[1]));
        for(int i=0;i<N;i++){
            System.out.println(points[i][0]+" "+points[i][1]);
        }
    }
}