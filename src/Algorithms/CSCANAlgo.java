package Algorithms;

import java.util.*;

//C++ TO JAVA CONVERTER WARNING: The following #include directive was ignored:
//#include <bits/stdc++.h>

// Code by Vikram Chaurasia 

// C++ program to demonstrate 
// C-SCAN Disk Scheduling algorithm 
public class CSCANAlgo
{

private static int size = 8;
private static int disk_size = 200; // ETO YUNG END VALUE

private static void CSCAN(int[] arr, int head)
{
	int seek_count = 0;
	int distance[] = new int[size];
	int cur_track;
	ArrayList<Integer> left = new ArrayList<Integer>();
	ArrayList<Integer> right = new ArrayList<Integer>();
	ArrayList<Integer> seek_sequence = new ArrayList<Integer>();

	// appending end values 
	// which has to be visited 
	// before reversing the direction 
	left.add(0);
	right.add(disk_size);

	// tracks on the left of the 
	// head will be serviced when 
	// once the head comes back 
	// to the beggining (left end). 
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
	Collections.sort(left);
	Collections.sort(right);

	// first service the requests 
	// on the right side of the 
	// head. 
	for (int i = 0; i < right.size(); i++)
	{
		cur_track = right.get(i);
		// appending current track to seek sequence 
		seek_sequence.add(cur_track);

		// calculate absolute distance 
		distance[i] = Math.abs(cur_track - head);
                if(distance[i] == 0)
                {
                    distance[i] = disk_size;
                }
                System.out.println(distance[i]);

		// increase the total count 
		seek_count += distance[i];

		// accessed track is now new head 
		head = cur_track;
	}

	// once reached the right end 
	// jump to the beggining. 
	head = 0;

	// Now service the requests again 
	// which are left. 
	for (int i = 0; i < left.size(); i++)
	{
		cur_track = left.get(i);

		// appending current track to seek sequence 
		seek_sequence.add(cur_track);

		// calculate absolute distance 
		distance[i] = Math.abs(cur_track - head);
                if(distance[i] == 0)
                {
                    distance[i] = disk_size;
                }
                System.out.println(distance[i]);

		// increase the total count 
		seek_count += distance[i];

		// accessed track is now the new head 
		head = cur_track;
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
public static void main(String args[])
{

	// request array 
	int[] arr = {98, 183, 37, 122, 14, 124, 65, 67};
	int head = 53;

	System.out.print("Initial position of head: ");
	System.out.print(head);
	System.out.print("\n");
	CSCAN(arr, head);
}
}
