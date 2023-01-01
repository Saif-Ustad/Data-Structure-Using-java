package Stack;

class Stack
{
    int size = 100;
    int s[] = new int[size];
    int top = -1;
}


class Stack_operation
{
    Stack st = new Stack();

    boolean IsEmpty()
    {
        if(st.top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean IsFull()
    {
        if(st.top==st.size-1)
            return true;
        else
            return false;    
    }

    void push(int x)
    {
        
        if(!IsFull())
        {   
            st.top++ ;
            st.s[st.top] = x;
        }
        else
        {    
            System.out.print("Stack is full");
        }    
    }

    int pop()
    {
        if(!IsEmpty())
        {
            int x;
            x = st.s[st.top];
            return x;
        }
        else
        {
            System.out.print("stack is empty");
            return -1;
        }
        
    }

    int StackTop()
    {
        int x;
        x = st.s[st.top];
        return x;
    }

    void display()
    {
        int i;
        for(i=st.top; i>=0; i--)
        {
            System.out.println(st.s[i] + "\n");
        }
    }

}

public class Stack_Using_Array {
 
    public static void main(String []args)
    {
        
        Stack_operation stArray = new Stack_operation();
        stArray.push(10);
        stArray.push(20);
        stArray.push(30);
        stArray.push(40);
        stArray.push(50);

        stArray.display();
        stArray.pop();

        stArray.display();

    }
}
