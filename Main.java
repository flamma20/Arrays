/*  Messing around with arrays :D */

 
public class Main
{
 
    double[] qArray = {20.1,20.3,20.8,20.1,20.7};
    
    public Main()
    {
        
      double average1,highest, minimum; 
      int    len;
      double sum=0;
      
      System.out.print("\u000c");
      
      len=qArray.length;
      
      for (int i=0; i<len; i++)
      {
       sum = sum+qArray[i];    
      }
      
      average1 = sum/len;

      highest = get_highest(qArray, len); 
      minimum = get_lowest(qArray, len);
      for (int i = 0; i < qArray.length; i++) {
            double percentage = (qArray[i] / sum) * 100;
            System.out.printf("The percentage of element %.2f in the array is %.2f%%\n", qArray[i], percentage);
        }
      
      System.out.printf("The average of the elements in the array is %.2f\n", average1);
      System.out.printf("The maximum of the elements in the array is %.2f\n", highest);
      System.out.printf("The sum of the elements in the array is %.2f\n", sum);
      System.out.printf("The minimum of the elements in the array is %.2f\n", minimum);
      

     }
 
    public double get_highest(double a[], int size) 
    {
     int i;
     double max =  a[0];
     
     for (i = 1; i < size; i++)
            if (a[i] > max)
                max = a[i]; 
                return max;
    }
    
    public double get_lowest(double b[], int lens) 
    {
     int i;
     double min =  b[0];
     
     for (i = 1; i < lens; i++)
            if (b[i] < min)
                min = b[i]; 
                return min;
    } 
    
    
    
    public static void main(String[] args)
    {
     new Main();

    }  
}