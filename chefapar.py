def fine_cal():
	
	test_cases = raw_input()
	

	for i in range(0,int(test_cases)):

		zero_found = False
		final_amt = 0

		no_months = input()
			

		data = raw_input()
		

		final_data = [int(j) for j in data.split(" ")]
		

		for k in range(0, no_months):


			if final_data[k] == 0 and zero_found == False :
				zero_found = True

			if final_data[k] == 1 and zero_found == True :
				final_amt += 100

			if final_data[k] == 0:
			
				final_amt += 1100




		print final_amt
fine_cal()
        

   

	
