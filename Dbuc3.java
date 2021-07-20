/**********************************************************************************************************************************************************************
 *
 *	Using Cartesian system to calculate the Length of the Line
 *  To Check the equality of the two lines
 *  I know one line is equal, greater or less than the other line
 *
 * 	@author Immanuvel Jeeva
 *  @Since 11-07-2021
 *
 *********************************************************************************************************************************************************************/

import java.util.Scanner;
class Dbuc3 {

    public static void main(String arg[]) {

        // Declaration Part
        int x1,x2,y1,y2,a1,a2,b1,b2;
        double dis1,dis2;

        // Get the input x1,y1,x2,y2,a1,a2,b1,b2 from the user
        Scanner sc=new Scanner(System.in);

        System.out.println("enter x1 point");
        x1=sc.nextInt();

        System.out.println("enter y1 point");
        y1=sc.nextInt();

        System.out.println("enter x2point");
        x2=sc.nextInt();

        System.out.println("enter y2 point");
        y2=sc.nextInt();

        System.out.println("enter a1 point");
        a1=sc.nextInt();

        System.out.println("enter b1 point");
        b1=sc.nextInt();

        System.out.println("enter a2point");
        a2=sc.nextInt();

        System.out.println("enter b2 point");
        b2=sc.nextInt();

        dis2=Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));

        System.out.println("Length between "+"("+a1+","+b1+"),"+"("+a2+","+b2+")===>"+dis2);

        dis1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("Length between "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis1);

        String disValue1 = Double.toString(dis1);
        String disValue2 = Double.toString(dis2);

        int b = disValue1.compareTo(disValue2);
        System.out.println(b);

        if (b > 0) {
            System.out.println("Line2 Greater than Line1 ");
        }
        else if(b < 0) {
            System.out.println("Line1 Greater than Line2");
 		 }
		 else
			System.out.println("Two Lines are Equals");

    }

}

                 
