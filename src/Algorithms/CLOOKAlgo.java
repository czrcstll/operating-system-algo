package Algorithms;

import java.util.*;

// C++ implementation of the approach 
//C++ TO JAVA CONVERTER WARNING: The following #include directive was ignored:
//#include <bits/stdc++.h>
public class CLOOKAlgo
{
private static int size = 8;
private static int disk_size = 200;

// Function to perform C-LOOK on the request 
// array starting from the given head 
private static void CLOOK(int[] arr, int head)
{
	int seek_count = 0;
	int distance[] = new int[size];
	int cur_track;
	ArrayList<Integer> left = new ArrayList<Integer>();
	ArrayList<Integer> right = new ArrayList<Integer>();
	ArrayList<Integer> seek_sequence = new ArrayList<Integer>();

	// Tracks on the left of the 
	// head will be serviced when 
	// once the head comes back 
	// to the beggining (left end) 
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

	// Sorting left and right vectors 
	Collections.sort(left);
	Collections.sort(right);

	// First service the requests 
	// on the right side of the 
	// head 
	for (int i = 0; i < right.size(); i++)
	{
		cur_track = right.get(i);

		// Appending current track to seek sequence 
		seek_sequence.add(cur_track);

		// Calculate absolute distance 
		distance[i] = Math.abs(cur_track - head);
                if(distance[i] == 0)
                {
                    distance[i] = arr[arr.length-1] - arr[0]; 
                }   
                System.out.println(distance[i]);

		// Increase the total count 
		seek_count += distance[i];

		// Accessed track is now new head 
		head = cur_track;
	}

	// Once reached the right end 
	// jump to the last track that 
	// is needed to be serviced in 
	// left direction 
	seek_count += Math.abs(head - left.get(0));
	head = left.get(0);

	// Now service the requests again 
	// which are left 
	for (int i = 0; i < left.size(); i++)
	{
		cur_track = left.get(i);

		// Appending current track to seek sequence 
		seek_sequence.add(cur_track);

		// Calculate absolute distance 
		distance[i] = Math.abs(cur_track - head);
                if(distance[i] == 0)
                {
                    distance[i] = arr[arr.length-1] - arr[0]; 
                }
                System.out.println(distance[i]);
                
		// Increase the total count 
		seek_count += distance[i];

		// Accessed track is now the new head 
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
        
        
//            int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += distance[i];
//    }
//        int total =sum-seek_count;
//        System.out.println("THE SUM IS: " + total); KULANG NG 14 WTF
}

// Driver code 
public static void main(String[] args)
{
	// Request array 
	int[] arr = {14, 37, 65, 67, 98, 122, 124, 183};
	int head = 53;

	System.out.print("Initial position of head: ");
	System.out.print(head);
	System.out.print("\n");

	CLOOK(arr, head);
}
}
