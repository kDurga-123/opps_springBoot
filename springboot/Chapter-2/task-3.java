// Interface Implementation: Define an interface named Climbable with a method canClimb(). Implement
// this interface in the MountainPeak class and provide an implementation for the method.

interface Climbable
{
    void canClimb();
}
class MountainPeak implements Climbable
{
    public void canClimb()
    {
        System.out.println("i have reached the mountain");
    }
    public static void main(String[] args)
    {
        MountainPeak obj = new MountainPeak();
        obj.canClimb();
    }
}