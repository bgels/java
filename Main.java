public class Main
{
    public static void main(String[] args)
    {
        // Create a String
        String stats = "Health: 100";
        System.out.println("Newly created: " + stats);
        
        
        stats += "\n" + "Speed: 75";
        
        // The \n before Updated adds an extra
        // line between the last print statement
        // and this one
        System.out.println("\nUpdated: ");
        System.out.println(stats);
        
        // You don't have to separate the 
        // escape characters
        stats += "\nPower: 94";
        
        // Note there is no space between \n and Combining
        // A space would put a space as the first
        // character of the line before Combining
        System.out.println("\nCombining escape characters: ");
        System.out.println(stats);
        
        

        stats = "Health: 100\nSpeed: 75\nPower: 96";
        System.out.println(); // print a blank line
        System.out.println(stats);
    }
}
