package com.Project.Floors;

import java.util.Arrays;
import java.util.Stack;

public class FloorsAssemble
{
	
	@SuppressWarnings("rawtypes")
	public static Stack<Integer> assemble(Stack stack, int cur_flr, int tmp, int[] arr)
	{

		int[] array_pop = new int[arr.length];
		int count = 0;

		System.out.print("Day " + (tmp + 1) + " : " + cur_flr);
		Stack<Integer> stackTmp = new Stack<Integer>();
		boolean isBig;
		
		if (tmp == arr.length - 1) 
		{
			while (!stack.empty())
			{
				int pop1 = (int) stack.pop();
				array_pop[count++] = pop1;
			}
			
			if (array_pop != null) 
			{
				Arrays.sort(array_pop);
				for (int i = array_pop.length - 1; i > 0; i--) 
				{
					if (array_pop[i] != 0)
					{
						System.out.print(" " + array_pop[i]);
					}

				}
			}

			return stackTmp;
		} 
		else
		{
			if (!stack.empty()) 
			{
				while (!stack.empty()) 
				{
					isBig = true;
					int floor_pop = (int) stack.pop();
					
					for (int i = tmp; i < arr.length; i++) 
					{
						if (i == tmp) 
						{
							continue;
						}
						if (floor_pop < arr[i]) 
						{
							stackTmp.push(floor_pop);
							isBig = false;
							break;
						} else 
						{
							isBig = true;
						}
					}
					
					if (isBig == true) 
					{
						array_pop[count++] = floor_pop;
					}
				}
			}
			
			if (array_pop != null) 
			{
				Arrays.sort(array_pop);
				
				for (int i = array_pop.length - 1; i > 0; i--)
				{
					if (array_pop[i] != 0)
					{
						System.out.print(" " + array_pop[i]);
					}
				}
			}

			return stackTmp;
		}
	}
}
