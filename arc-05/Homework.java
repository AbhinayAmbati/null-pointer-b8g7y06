import java.util.*;

public class Homework {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();

        while(testCases-- > 0){
            int n = s.nextInt();
            String s1 = s.next();
            int m = s.nextInt();
            String s2 = s.next();
            String s3 = s.next();

            StringBuilder sb = new StringBuilder();

            for(int i=0;i<n;i++){
                sb.append(s1.charAt(i));
            }

            for(int i=0;i < m;i++){
                if(s3.charAt(i) == 'V'){
                    sb.insert(0, s2.charAt(i));
                }else{
                    sb.append(s2.charAt(i));
                }
            }
            System.out.println(sb);
        }
        s.close();
    }
    
}
