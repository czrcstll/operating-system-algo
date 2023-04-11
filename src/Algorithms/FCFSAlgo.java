package Algorithms;

// Java program to demonstrate 

import java.util.Scanner;

// FCFS Disk Scheduling algorithm 
class GFG 
{ 
  
static void FCFS(int arr[], int head, int size) 
{ 
    int seek_count = 0; 
    int first = head;
    int cur_track; 
    int distance[] = new int[size];
    int sort[] = new int[size];
  
    for (int i = 0; i < size; i++)  
    { 
        cur_track = arr[i]; 
  
        // calculate absolute distance 
        distance[i] = Math.abs(cur_track - head);
        
        // increase the total count 
        seek_count += distance[i]; 
  
        // accessed track is now new head 
        head = cur_track; 
    }
    //seek count = total number of tracks
    // Seek sequence would be the same 
    // as request array sequence 
    
    for(int i = 0; i < size; i++)
    {
        sort[i] = arr[i];
    }
    
    int temp;
    for (int i = 0; i < size; i++) 
        {
            for (int j = i + 1; j < size; j++) 
            {
                if (sort[i] > sort[j]) 
                {
                    temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }
  
    System.out.println("FCFS Disk Scheduling");
    System.out.println("-----------------------------------------------------");
    for (int i = 0; i < size; i++) 
    {
        System.out.print(sort[i] + "   ");
    } 
    System.out.println("\n-----------------------------------------------------");
    
    System.out.println("\nComputing for the total head movement: ");
    
    System.out.println("from " + first + " to " + arr[0] + " = " + distance[0]);
    for (int i = 0; i < size; i++) 
    {
        if(i == size-1)
            break;
        else
            System.out.println("from " + arr[i] + " to " + arr[i+1] + " = " + distance[i+1]);
    }
    System.out.println("Total Head Movement: " + seek_count + " tracks");
} 
  
public static void main(String[] args)  
{ 
    Scanner input = new Scanner(System.in);
    int size;
    
    System.out.println("Input size of array: ");
    size = input.nextInt();
    int arr[] = new int[size+1];
    for (int i = 0; i < size; i++) {
        System.out.println("Input for arr[" + i + "]: ");
        arr[i] = input.nextInt();
    }
    int head = 53; 
  
    FCFS(arr, head, size); 
} 
} 