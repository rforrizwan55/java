class Test
{
    public static void main(String arg[])
    {
        boolean t = true;
        
        first:  
        {
            second: 
            {
                third:  
                {
                    System.out.println("Before the break"); // LINE A
        
                    if(t) break second; // break out of second block
        
                    System.out.println("This won't execute - inside third block - after break"); // LINE B
                }
                
                System.out.println("This won't execute - inside second block"); // LINE C
            }
            
            System.out.println("After second block - inside first block"); // LINE D
        }
        
        System.out.println("After first block"); // LINE E
    
    }
}