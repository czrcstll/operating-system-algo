package Algorithms;

import java.util.*;

//C++ TO JAVA CONVERTER WARNING: The following #include directive was ignored:
//#include <bits/stdc++.h>

// Code by Vikram Chaurasia 

// C++ program to demonstrate 
// SCAN Disk Scheduling algorithm 
public class LOOKAlgo
{
private static int size = 8;
private static int disk_size = 200;

private static void LOOK(int[] arr, int head, String direction)
{
	int seek_count = 0;
	int distance[] = new int[size];
	int cur_track;
	ArrayList<Integer> left = new ArrayList<Integer>();
	ArrayList<Integer> right = new ArrayList<Integer>();
	ArrayList<Integer> seek_sequence = new ArrayList<Integer>();

	// appending values which are 
	// currently at left and right 
	// direction from the head. 
	for (int i = 0; i < size; i++)
	{
		if (arr[i] < head)
		{
			left.add(arr[i]);
		}
		if (arr[i] > head)
		{
			right.add(arr[i]);
		}
	}

	// sorting left and right vectors 
	// for servicing tracks in the 
	// correct sequence. 
	Collections.sort(left);
	Collections.sort(right);

	// run the while loop two times. 
	// one by one scanning right 
	// and left side of the head 
	int run = 2;
	while ((run--) != 0)
	{
		if (direction.equals("left"))
		{
			for (int i = left.size() - 1; i >= 0; i--)
			{
				cur_track = left.get(i);

				// appending current track to seek sequence 
				seek_sequence.add(cur_track);

				// calculate absolute distance 
				distance[i] = Math.abs(cur_track - head);
                                System.out.println(distance[i]);

				// increase the total count 
				seek_count += distance[i];

				// accessed track is now the new head 
				head = cur_track;
			}
			// reversing the direction 
			direction = "right";
		}
		else if (direction.equals("right"))
		{
			for (int i = 0; i < right.size(); i++)
			{
				cur_track = right.get(i);
				// appending current track to seek sequence 
				seek_sequence.add(cur_track);

				// calculate absolute distance 
				distance[i] = Math.abs(cur_track - head);
                                System.out.println(distance[i]);

				// increase the total count 
				seek_count += distance[i];

				// accessed track is now new head 
				head = cur_track;
			}
			// reversing the direction 
			direction = "left";
		}
	}

	System.out.print("Total number of seek operations = ");
	System.out.print(seek_count);
	System.out.print("\n");

	System.out.print("Seek Sequence is");
	System.out.print("\n");

	for (int i = 0; i < seek_sequence.size(); i++)
	{
		System.out.print(seek_sequence.get(i));
		System.out.print("\n");
	}
}

// Driver code 
public static void main(String[] args) 
{

	// request array 
	int[] arr = {14, 37, 65, 67, 98, 122, 124, 183};
	int head = 53;
	String direction = "right";

	System.out.print("Initial position of head: ");
	System.out.print(head);
	System.out.print("\n");

	LOOK(arr, head, direction);
}
}
