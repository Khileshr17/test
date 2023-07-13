// package basic;

import java.util.*;


public class java4{
  
   int salaryCalculator(int daysofwork,int perhourpaid){
    if(daysofwork < 0 || perhourpaid<0){
      return -1;
    }
    int amountperannum = daysofwork * perhourpaid;
    return amountperannum*52;
  }
    
  public static void main(String args[]) {
    
    java4 obj = new java4();
   int ans = obj.salaryCalculator(-40,15);
   System.out.println(ans);
  //  int 
            
  }
}  
