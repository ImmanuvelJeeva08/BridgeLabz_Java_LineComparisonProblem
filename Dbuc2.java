/**********************************************************************************************************************************************************************
 ************************************************** Using Cartesian system to calculate the Length of the Line ******************************************************** 
 ******************************************************** To Check the equality of the two lines **********************************************************************
 *
 *  @author Immanuvel Jeeva
 *  @Since 11-07-2021
 *
 *********************************************************************************************************************************************************************/

import java.util.Scanner;
class Dbuc2 {

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

		 if (disValue1.equals(disValue2)) {   // Check the Lines are equal or not
			System.out.println("Two Lines are Equals");
 		 }
		 else
			System.out.println("Two Lines are Not Equals");

    }

}



