
/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */

/*
Step 1: Get inputs - Hourly rate, hours turned, commission %, and $ of sales made
Step 2: Calculate hourly pay
Step 3: Calculate pay from commission
Step 4: Combine pays together
Step 5: Output results
 */

import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {
    public static void main(String[] args) {
        double hourlyRate= Double.parseDouble(JOptionPane.showInputDialog("How much do you make each hour?"));
        double hoursTurned= Double.parseDouble(JOptionPane.showInputDialog("How many hours did you turn this week?"));
        double commissionRate= (Double.parseDouble(JOptionPane.showInputDialog("What % do you make off of sales?")))/100.00;
        double salesMade= Double.parseDouble(JOptionPane.showInputDialog("How much sales did you make this week?"));

        double hourlyPay = calcHourlyPay(hourlyRate, hoursTurned);

        double commissionPay = calcCommissionPay(commissionRate, salesMade);

        double totalPay = calcTotalPay(hourlyPay, commissionPay);

        displayResults(totalPay);

        System.exit((int)(totalPay*100));
    }

    public static double calcHourlyPay(double hourlyRate, double hoursTurned){
        return hourlyRate * hoursTurned;
    }

    public static double calcCommissionPay(double commissionRate, double salesMade){
        return commissionRate * salesMade;
    }

    public static double calcTotalPay(double hourlyPay, double commissionPay){
        return hourlyPay + commissionPay;
    }

    public static void displayResults(double totalPay){
        DecimalFormat money = new DecimalFormat("$#,###.00");

        JOptionPane.showMessageDialog(null, "This week, you made " + money.format(totalPay) + "\n" + "At this rate, you'll make " + money.format(totalPay*(52.142857)) + " this year.");
    }
}
