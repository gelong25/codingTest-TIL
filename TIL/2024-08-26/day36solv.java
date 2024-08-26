import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
    private static List<Integer> numArr = new ArrayList<>();
    
    public static int multiple() {
        int number = 1; 
        
        while(true) {
            int cnt = 0;
            
            for(int num : numArr) {
                if(number % num == 0) {
                    cnt++;
                }
            }         
            if(cnt > 2) {
                return number;
        }
        number++;
      }
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            numArr.add(Integer.parseInt(st.nextToken()));
        }

        int answer = multiple();
        System.out.println(answer);

    }


}
