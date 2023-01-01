class Node
{
    public int data;
    public Node Next ;
}

class Linked_list_operation
{
    public void  display_linked_list(Node p)
    {
        while(p != null)
        {
            System.out.print(p.data);
            System.out.print("\t");
            p = p.Next ; 
        }
        System.out.println();

    }
    public void count_linked_list_nodes(Node p)
    {
        int count=0;
        while(p != null)
        {
            count++ ;
            p = p.Next ;
        }

        System.out.println("Number of Nodes in linked list is : " + count);
    }
    public void sum_of_linked_list_data(Node p)
    {
        int sum=0;
        while(p != null)
        {
            sum += p.data ;
            p = p.Next ;
        }

        System.out.println("sum of linked list data is : " + sum);
    }
    public void max_term_in_linked_list(Node p)
    {
        int max=p.data;
        while(p != null)
        {
            if(max<p.data)
            {
                max = p.data ;
            }
            p = p.Next ;
        }
        System.out.println("Maximum term in linked list is : " + max);
    }
    public void min_term_in_linked_list(Node p)
    {
        int min=p.data;
        while(p != null)
        {
            if(min>p.data)
            {
                min = p.data ;
            }
            p = p.Next ;
        }
        System.out.println("Maximum term in linked list is : " + min);
    }
    public void search_term_in_linked_list(Node p , int key)
    {
        while(p != null)
        {
            if(key == p.data)
            {
                //return p;
                System.out.println("location of data is : " + p.Next);
            }
            p = p.Next ;
        }
    }
    
}
public class linked_list {
    
    public static void main(String[] args)
    {
        int a[] = new int[5];
        for(int i=0;i<5; i++)
        {
            a[i] = i + 1 ;
        }

        Node last;
        Node first = new Node();

        first.data = a[0];
        first.Next = null ; 
        last = first;
        
        for(int i=1; i<5; i++)
        {
            Node temp = new Node();
    
            temp.data = a[i];
            temp.Next = null;
            last.Next = temp ;
            last = temp ;
        }    
         
        Linked_list_operation l = new Linked_list_operation();
        l.display_linked_list(first);
        l.count_linked_list_nodes(first);
        l.sum_of_linked_list_data(first);
        l.max_term_in_linked_list(first);
        l.min_term_in_linked_list(first);
        l.search_term_in_linked_list(first, 4);
    }

}
