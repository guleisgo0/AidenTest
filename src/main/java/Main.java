import java.util.Scanner;
import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        for (int x=0; x != 6;x++)
        {
            System.out.println("Give me a name!");
            names.add(myObj.nextLine());
        }

        while (1==1)
        {
            System.out.println("Dwarfcheck?");
            String dwrfCheck = myObj.nextLine();
            if (names.contains(dwrfCheck))
            {
                System.out.println("They're a dwarf!");
            }
            else
            {
                System.out.println("They're not a dwarf!");
            }
        }
    }
}
