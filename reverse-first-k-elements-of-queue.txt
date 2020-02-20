Given an integer K and a queue of integers, we need to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.

Only following standard operations are allowed on queue.

enqueue(x) : Add an item x to rear of queue
dequeue() : Remove an item from front of queue
size() : Returns number of elements in queue.
front() : Finds front item.
Input Format:
First line consists of T test cases. First line of every test case consists of 2 integers, N and K, denoting number of elements and number of elements to be reversed respectively. Second line of every test case consists of elements of array.

Output Format:
For each testcase, in a new line, print the modified queue.

Your Task:
Since this is a function problem, you don't need to take inputs. Just complete the provided function modifyQueue that takes queue and k as parameters and returns a modified queue. The printing is done automatically by the driver code.

Constraints:
1 <= T <= 100
1 <= N <= 1000
1 <= K <= N

Example:
Input:
2
5 3
1 2 3 4 5
4 4
4 3 2 1
Output:
3 2 1 4 5
1 2 3 4

Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
class ModifyQueue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
            while(n-->0){
                q.add((int)sc.nextInt());
            }
            GfG g=new GfG();
            Queue<Integer> ans=g.modifyQueue(q,k);
            while(!ans.isEmpty()){
                int a=ans.peek();
                ans.poll();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      Queue<Integer> a = new ArrayDeque<>();
      Stack<Integer> b = new Stack<>();
      int i =0;
      while(i < k) {
          b.push(q.poll());
          i++;
      }
      while(!b.empty()){
          a.add(b.pop());
      }
      while(q.peek() !=null){
          a.add(q.poll());
      }
      return a;
      
    }
}
