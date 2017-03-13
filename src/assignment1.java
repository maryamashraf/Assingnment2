/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Azmat Chand
 */
import java.util.Random;
import java.text.DecimalFormat ; 
public class assignment1 {


public static void main (String []args)
{
Random as = new Random();
int  n;
DecimalFormat m = new DecimalFormat("0.####") ;
n=as.nextInt(21)+20;
System.out.println("RANDOM NUMBER IS="+m.format(n);
System.out.println("RANDOM NUMBER sin IS="+m.format(Math.sin(n));
System.out.println("RANDOM NUMBER tan IS="+m.format(Math.tan(n));
System.out.println("RANDOM NUMBER cos IS="+m.format(Math.cos(n));
}



    
}
