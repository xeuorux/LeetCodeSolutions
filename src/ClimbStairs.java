//at first i tried developing my own mathematical model of the problem, but then by looking
//through the list of expected values i realized it was just fibonacci
//that was a disspointment

public class ClimbStairs
{
	public int climbStairs(int n) {
        
        int last = 0;
        int current = 1;
        
        for (int i = 0;i<n;i++)
        {
            int temp = current;
            current = last + current;
            last = temp;
        }
        
        return current;
    }
}