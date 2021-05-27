import java.util.*;
import java.io.*;

class Stack
{
    Node head; //head of the list Stack
    int max;
    public int count = 0;
    
    //Node
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //Constructor
    Stack(int i)
    {
        max = i;
    }

    
    boolean checkEmpty()
    {
        return count == 0;
    }

    boolean checkFull()
    {
        return count == max;
    }
    
    
    public void push(int data)
    {
        
        if(checkFull())
        {
            System.out.println("Stack is Overflowing");
        }
       
        else
        {
            Node node_new = new Node(data);
            if(checkEmpty())
            {
                head = node_new;
                count++;
            }
            else
            {
                node_new.next = head;
                head = node_new;
                count++;
            }
        }
    }

    public void pop()
    {
       
        if(checkEmpty())
        {
            System.out.println("Stack is Underflowing");
        }
        
        else
        {
            Node temp = head;
            head = head.next;
            count--;
        }
    }
}

public class StackImp
{
   
    public void display(Stack st1, Stack st2)
    {
        if(st1.count==st2.count)
        {
            System.out.println("Total number of elements in both stacks is : "+st2.count);
        }
    }

 
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Stack st1 = new Stack(20);
        Stack st2 = new Stack(20);
        int ch, data;
        StackImp si = new StackImp();
        while(true)
        {
            System.out.println("\n1. Push in Stack 1");
            System.out.println("\n2. Push in Stack 2");
            System.out.println("\n3. Pop in Stack 1");
            System.out.println("\n4. Pop in Stack 2");
            System.out.println("\nEnter your choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the Data: ");
                data = sc.nextInt();
                st1.push(data);
                si.display(st1,st2);
                break;

                case 2:
                System.out.println("Enter the Data: ");
                data = sc.nextInt();
                st2.push(data);
                si.display(st1,st2);
                break;

                case 3:
                //System.out.println(s1.pop());
                st1.pop();
                si.display(st1,st2);
                break;

                case 4:
                //System.out.println(s2.pop());
                st2.pop();
                si.display(st1,st2);
                break;

                default:
                System.out.println("NULL");
                break;
            }
        }
    }
}
