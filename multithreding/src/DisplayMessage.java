/**
 * This class uses one of the two ways to create a thread
 * 1. Extending the Thread class
 * 2. Implementing the Runnable Interface
 * */
public class DisplayMessage implements Runnable
{
    private String message;
    public DisplayMessage(String message)
    {
        this.message = message;
    }
    public void run()
    {
        while(true)
        {
            System.out.println(message);
        }
    }
}

