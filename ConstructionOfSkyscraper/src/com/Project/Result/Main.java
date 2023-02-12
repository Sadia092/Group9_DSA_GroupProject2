
package com.Project.Result;

import java.util.Scanner;

import com.Project.Floors.Floors;

public class Main {

	public static void main(String[] args)
	{
		System.out.println("Enter the total no of floors in the building : ");

		try (Scanner sc = new Scanner(System.in))
		{
			int noOffloors = sc.nextInt();
			int[] floors = new int[noOffloors];

			for (int i = 0; i < noOffloors; i++)
			{
				System.out.println("Enter the floor size given on day : " + (i + 1));
				int floorSize = sc.nextInt();
				floors[i] = floorSize;
			}
			Floors.construct(floors);
		}

		}
}

