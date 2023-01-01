class Queue
{
    int Q[] = new int[10];
    int rare,front;
    int size;

    Queue()
    {
        size = 6;
        int Q[] = new int[size];
        int rare=front=-1;
    }

    Queue(int size)
    {
        int Q[] = new int[size];
        int rare=front=-1;
    }

    boolean IsEmpty()
    {
        if(rare==-1)
        {
            return true;
        }  
        else
        {
           System.out.println("saif");
            return false;   
        }
             
    }

    boolean IsFull()
    {
        if(rare==size-1)
            return true;
        else 
            return false;

    }

    void enqueue(int x)
    {
        if(IsFull())
        {
            System.out.println("Queue is full");
        }
        else
        {
            if(front==-1)
            { 
                front++;
                rare++;
                Q[rare] = x;
            }
            else
            {
                rare++;
                Q[rare] = x;    
            }    
        }
    }

    int dequeue()
    {
        if(IsEmpty())
        {    
            System.out.println("Queue is empty");
            return -1;
        }
        else
        {
            int x;
            if(front==rare)
            { 
                x = Q[front];
                front=rare=-1;
                return x;  
            }
            else
            {
                x = Q[front];
                front++;
                return x;
            }
        }

    }

    void display()
    {
        for(int i=front; i<=rare; i++)
        {
            System.out.println(Q[i]);
        }
    }
}

class Linear_Queue_using_array {
    
    public static void main(String []args)
    {
        Queue q = new Queue();
        System.out.println( q.IsEmpty());
        

       // q.display();
    }
}
