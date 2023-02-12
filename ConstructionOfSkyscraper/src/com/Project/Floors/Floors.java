package com.Project.Floors;

import java.util.Stack;

public class Floors 
{
	
	@SuppressWarnings("unchecked")
	public static void construct(int[] size)
	
	{
		boolean isBig;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < size.length; i++) 
		{
			isBig = true;
			int fsize1 = size[i];
			for (int j = i; j < size.length; j++)
			{
				if (j == i)
				{
					continue;
				} 
				else 
				{
					int fsize2 = size[j];
					if (fsize1 >= fsize2)
					{
						isBig = true;
						continue;
					} 
					else
					{
						isBig = false;
						stack.push(fsize1);
						break;
					}
				}
			}

			if (isBig == true)
			{
					@SuppressWarnings("rawtypes")
					Stack stack_tmp = FloorsAssemble.assemble(stack, fsize1, i, size);
					stack.clear();
					stack = (Stack<Integer>) stack_tmp.clone();
					stack_tmp.clear();
					System.out.println();
				
			} 
			else
			{
				System.out.println("Day " + (i + 1) + " :");
			}
		}
	}
	
}
