import java.util.* ;

class Node
{
    public int data;
    public Node next;
};

class stack
{
    private Node top;


    stack()
    {
        top = null;
    }

    public void push(int x)
    {
        Node t;
        t = new Node();
        t.data = x;
        t.next = top;
        top = t;

    }

    public int pop()
    {
        if(top==null)
        {
           System.out.println("stack is empty");
           return 0;
        }
        else
        {
            Node p;
            int x;
            p = top;
            x = p.data;
            top = top.next;
            return x;
        }
    }

    public boolean isOparand(char x)
    {
        if(x=='+' || x=='-' || x=='*' || x=='/' || x=='^' || x=='(' || x==')' )
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public int Evaluation_Of_Postfix(String postfix)
    {
        int i=0;
        int x1, x2, r;

        for(i=0; i<postfix.length(); i++)
        //for(i=0; postfix[i]!='\0'; i++)
        {
            if(isOparand(postfix.charAt(i)))
            {
                push(postfix.charAt(i) - '0');
            
            }
            else
            {
           
                x2 = pop();
                x1 = pop();
            
                switch(postfix.charAt(i))
                {
                    case '+' :
                    r = x1 + x2 ;
                    push(r);
                    break;

                    case '-' : 
                    r = x1 - x2 ;
                    push(r);
                    break;

                    case '*' : 
                    r = x1 * x2 ;
                    push(r);
                    break;
    
                    case '/' : 
                    r = x1 / x2 ;
                    push(r);
                    break;

                    case '^' :
                    r  = 1;
                    for(int m=0; m<x2; m++)
                    {
                        r = r*x1;
                    }
                    push(r);
                    break;


                }
            }
        }
        return top.data; // or return (r);
    
    }
}

class Evaluation_Of_Postfix
{
    public static void main(String []args)
    {
        stack stk = new stack();
        stk.push('#');

        System.out.println(stk.Evaluation_Of_Postfix("833+-362/+*2^"));
    } 

}
