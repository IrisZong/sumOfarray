 
 public class arraySum {
    
    
   
public static void main(String args[]) {
   
   int[] arr=new int[]{1,2,3,7};    
    
   int sum=0;

      for (int i =0; i<arr.length; i++) {
     
         sum+=arr[i];     
     }  
    
     System.out.println("the sum of all elments in this array is "+sum);
 
    }      
    }

/* evalution of for loop
 * 
 * when i=0 ,  sum = sum + arr[0] = 0+1=1;
 when i=1, sum = sum + arr[1] = 1+2= 3;
 when i=2 , sum =sum + arr[2] = 3+ 3 =6;
 when i=3 , sum = sum + arr[3] = 6+ 4= 10;
 when i=4 , sum = sum + arr[4] = 10+ 5= 15; 

 * 
 
 * 
 */