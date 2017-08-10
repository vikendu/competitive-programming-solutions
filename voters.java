import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;
class fourteen_14
{
	public static void main(String args[])throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String [] input_line = input.readLine().split(" ");
		int n1 = Integer.parseInt(input_line[0]);
		int n2 = Integer.parseInt(input_line[1]);
		int n3 = Integer.parseInt(input_line[2]);
		PrintWriter print_ = new PrintWriter(System.out,true);
		int total_size = n1 + n2 + n3;
		ArrayList array_count = new ArrayList();
		int input_voter_no = 0;
		int loop_count = 0;
		int biggest = 0;
		for(int i = 1;i <= total_size; i++)
		{
			input_voter_no = Integer.parseInt(input.readLine());
			array_count.add(input_voter_no);
            
			if (input_voter_no > biggest)
			{
			    biggest = input_voter_no;
			 }
		}
		int array_size = array_count.size();
		int array_final[] = new int[biggest+1];
		for( int i = 0; i < array_size; i++)
		{
		    array_final[(int)array_count.get(i)] += 1;
		  }
		StringBuffer final_list = new StringBuffer();
		for(int j = 1;j <= biggest;j++)
		{
			if (array_final[j]>=2)
			{
				loop_count+=1;
				final_list.append(j);
				final_list.append("\n");
			}
			
		}
		print_.println(loop_count);
		print_.println(final_list);
		
		
	}
}