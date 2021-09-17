import java.util.*;
 
class StackTrans
{
static class Queue
{
    static Stack<Integer> st1 = new Stack<Integer>();
    static Stack<Integer> st2 = new Stack<Integer>();
 
    static void enQueue(int x)
    {
        // Move all elements from st1 to st2
        while (!st1.isEmpty())
        {
            st2.push(st1.pop());
            //st1.pop();
        }
 
        // Push item into st1
        st1.push(x);
 
        // Push everything back to st1
        while (!st2.isEmpty())
        {
            st1.push(st2.pop());
            //st2.pop();
        }
    }
 
    // Dequeue an item from the queue
    static int deQueue()
    {
        // if first stack is empty
        if (st1.isEmpty())
        {
            System.out.println("Q is Empty");
            System.exit(0);
        }
 
        // Return top of st1
        int x = st1.peek();
        st1.pop();
        return x;
    }
};
 
// Driver code
public static void main(String[] args)
{
    Queue que = new Queue();
    que.enQueue(1);
    que.enQueue(2);
    que.enQueue(3);
 
    System.out.println(que.deQueue());
    System.out.println(que.deQueue());
    System.out.println(que.deQueue());
}
}
