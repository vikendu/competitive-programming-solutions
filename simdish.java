import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class eighteen_18
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(input.readLine());
        int i = 0;
        int j = 0, k = 0, match = 0;
        String ingred[];
        String to_check[];
        //String output = "";
        //StringBuilder output = new StringBuilder();
        for(i = 0; i < test_cases; i++)
        {
            match = 0;
            ingred = input.readLine().split(" ");
            to_check = input.readLine().split(" ");
            for(j = 0;j < to_check.length; j++)
            {
                for(k = 0; k < to_check.length; k++)
                {
                if(ingred[j].equals(to_check[k]) == true)
                {
                    match += 1;
                }
                }
            }
            if(match >= 2)
            {
                System.out.println("similar");
            }
            else
            {
                System.out.println("dissimilar");
            }
        }
    }
}
            