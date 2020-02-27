/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofobjectspractice;

import java.util.Scanner;

/**
 *
 * @author karan
 */
public class Arrayofobjectspractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Modell[] list=new Modell[3];
        int i;
        int rn;
        double mark1,mark2,mark3;
        Scanner n=new Scanner(System.in);
        for(i=0;i<list.length;i++)
        {
            System.out.println("Enter rollnum");
            rn=n.nextInt();
            System.out.println("Enter mark1");
            mark1=n.nextDouble();
            System.out.println("Enetr mark2");
            mark2=n.nextDouble();
            System.out.println("Enter mark3");
            mark3=n.nextDouble();
           Modell ob=new Modell(rn, mark1, mark2, mark3);
           list[i]=ob;
        }
        for(i=0;i<list.length;i++)
        {
            System.out.println("Details are \n " + list[i].toString());
        }
       
    }
    
}
