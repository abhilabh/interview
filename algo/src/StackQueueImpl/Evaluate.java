package StackQueueImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 * Created by abhilabh on 1/27/19.
 */
public class Evaluate {
    public static void main(String args[]) throws IOException{
       StackLinkListImpl<String> ops = new StackLinkListImpl<String>();
        StackLinkListImpl<Double> vals = new StackLinkListImpl<Double>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null ;
        String str = null;
        st = new StringTokenizer(br.readLine());
        while (st != null && st.hasMoreElements())
        {
            //st = new StringTokenizer(br.readLine());
            str = st.nextToken();
            if(str.equalsIgnoreCase( "(" )){}
            else if(str.equalsIgnoreCase( "+")){
                ops.push(str);
            }
            else if(str.equalsIgnoreCase( "-")){
                ops.push(str);
            }
            else if(str.equalsIgnoreCase( "/")){
                ops.push(str);
            }
            else if(str.equalsIgnoreCase( "*")){
                ops.push(str);
            }
            else if(str.equalsIgnoreCase( ")")){
                String s = ops.pop();
                if (s.equalsIgnoreCase( "+")){
                    vals.push(vals.pop() + vals.pop());
                }
                else if (s.equalsIgnoreCase( "*")){
                    vals.push(vals.pop() * vals.pop());
                }
                else if (s.equalsIgnoreCase( "-")){
                    vals.push(vals.pop() - vals.pop());
                }
                else if (s.equalsIgnoreCase( "/")){
                    vals.push(vals.pop() / vals.pop());
                }
            }
            else {
                vals.push(Double.parseDouble(str));
            }

        }

        System.out.println("value = "+ vals.pop());

    }
}
