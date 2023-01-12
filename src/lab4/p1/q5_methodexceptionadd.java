package lab4.p1;

import static java.lang.Double.parseDouble;

public class q5_methodexceptionadd {
    public static double add(String[] numbers_as_string) throws RangeException{
        double total_sum=0,rough;
        for(String num : numbers_as_string){
            rough=parseDouble(num);
            if(0 > rough || 1 < rough){
                throw new RangeException("The range is 0 to 1 only");
            }
            total_sum+=rough;
        }
        return total_sum;
    }
    public static void main(String[] args) {
        String[] array1=new String[5];//No problem
        array1[0]="0.1";array1[1]="0.1";array1[2]="0.1";
        array1[3]="0.1";array1[4]="0.1";
        String[] array2=new String[5];//Not valid string to convert to double
        array2[0]="0.1";array2[1]="0sv1";array2[2]="0vsd1";
        array2[3]="0.1";array2[4]="0vs";
        String[] array3=new String[5];//range issue
        array3[0]="0.1";array3[1]="0.1";array3[2]="0.1";
        array3[3]="1.1";array3[4]="0.1";
        double ans1=0,ans2=0,ans3=0;
        System.out.println("String array1");
        try {
            ans1=add(array1);
        }catch (NumberFormatException e1){
            e1.printStackTrace();
        }catch (RangeException r1){
            r1.printStackTrace();
        }finally {
            System.out.println(ans1+"\nThanks for using add method");
        }
        System.out.println("String array2");
        try {
            ans2=add(array2);
        }catch (NumberFormatException e1){
            e1.printStackTrace();
        }catch (RangeException r1){
            r1.printStackTrace();
        }finally {
            System.out.println(ans2+"\nThanks for using add method");
        }
        System.out.println("String array2");
        try {
            ans3=add(array3);
        }catch (NumberFormatException e1){
            e1.printStackTrace();
        }catch (RangeException r1){
            r1.printStackTrace();
        }finally {
            System.out.println(ans3+"\nThanks for using add method");
        }
       System.out.println();
    }
}
