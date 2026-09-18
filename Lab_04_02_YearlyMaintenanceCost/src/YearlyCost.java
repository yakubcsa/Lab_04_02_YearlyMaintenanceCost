//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class YearlyCost
{

    static void main()
        {
            double spring = 25.5;
            double fall = 20.4;
            double winter = 30.3;
            double summer = 50.2;
            double totalCost = 0;

            totalCost = spring + summer + fall + winter;
            IO.println("The total cost is " + totalCost);
        }

}

