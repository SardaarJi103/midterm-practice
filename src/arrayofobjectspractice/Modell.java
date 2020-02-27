/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofobjectspractice;

/**
 *
 * @author karan
 */
public class Modell 
{
   private int r_num;
   private double mark1,mark2,mark3;

    public Modell(int r_num, double mark1, double mark2, double mark3) {
        this.r_num = r_num;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    /**
     * @return the r_num
     */
    public int getR_num() {
        return r_num;
    }

    /**
     * @return the mark1
     */
    public double getMark1() {
        return mark1;
    }

    /**
     * @return the mark2
     */
    public double getMark2() {
        return mark2;
    }

    /**
     * @return the mark3
     */
    public double getMark3() {
        return mark3;
    }
   public String toString()
   {
       return " ROll num is " + r_num + " \n averhge of marks is " + (mark1+mark2+mark3/3);
   }
   
}
