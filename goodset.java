import java.io.*;
import java.util.*;

class twenty_20
{
    /*static boolean isPresent(int chk, ArrayList arr)
    {
        int i = 0;
        boolean ret_stmt = false;
        for(     ;i < arr.size(); i++)
        {
            if(arr.get(i).equals(chk))
            {
                ret_stmt = true;
            }
            
        }
        return ret_stmt;
    }
    static boolean isUnique(ArrayList arr)
    {
        int i = 0,j;
        boolean ret = true;
        int rep_vals = 0;
        for(    ; i < arr.size() ; i++)
        {
            for(j = 0; j < arr.size(); j++)
            {
                if(arr.get(i) == arr.get(j))
                {
                    ret = false;
                    rep_vals = rep_vals + 1;
                }
                
            }
        }
        System.out.println("repeated vals"+rep_vals);
        return ret;
    }*/
                    
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(read);
        int test_cases = Integer.parseInt(input.readLine());
        int std_set[] = new int[500];
        int k = 0;
        //creating std set
        int m = 0;
        for(    ; m < 250 ; m++)
        {
            std_set[m] = (m + (m+1));
        }
    
        for (k = 0; k < test_cases; k++)
        {
        int set_size = Integer.parseInt(input.readLine());
        ArrayList<Integer> final_set = new ArrayList<Integer>(set_size);
        ArrayList<Integer> no_go = new ArrayList<Integer>();
        
        //int[] std = new Int[500];
        //Random rand = new Random();
        //final_set.add(0,1);
        int i = 0;
        int j = 0;
        int found = 0;
        int loop = 0;
        boolean evr_fine = true;
        int loop_2 = 0;
        
        for( i = 0 ; i < 250; i++)
        {
            loop = 0;
            for(j = 0; j < 249 ; j++)
            {
                
                if(std_set[i] != std_set[j] + std_set[j + 1])
                {
                    evr_fine = true;
                    loop = loop + 1;
                    //System.out.println("" + std_set[i]+"  "+evr_fine+"  "+loop);
                }
                else
                {
                    evr_fine = false;
                    //System.out.println("  "+evr_fine);
                }
            }
            if((evr_fine == true && loop == 249) && loop_2 < set_size )
            {
                final_set.add(std_set[i]);
                loop_2 = loop_2 + 1;
            }
            else if(loop_2 >= set_size)
            {
                break;
            }
        }
                
                    
        StringBuffer output = new StringBuffer("");
       for(i = 0; i < final_set.size(); i++)
       {
           //System.out.println(final_set.get(i));
        output.append(Integer.toString(final_set.get(i))+" ");
       }
       //output.deleteCharAt(output.liength()-1);
        System.out.println(""+output);
        //isUnique(final_set);
    
       }
    
   


     
    }
}
        