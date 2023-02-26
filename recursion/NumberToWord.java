// You are given a number (eg - 2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
// can’t be 0.

public class NumberToWord{
 public static void main(String args[]){
    printNums(1234);
 }

 public static void printNums(int num){

 String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
if(num==0){
    return;
}

int lastdigit=num%10;
printNums(num/10);
System.out.print(digits[lastdigit]+" ");

 

 }
}