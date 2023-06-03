import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     //   System.out.println(chet(5));
      int [] arr={-64,1,7,-3,4,-5,6};
      int [] arr2={4,5,6};
    //   System.out.println(maxAbs(arr));
  //    arr=maxAbs(arr);
    //  System.out.println(Arrays.toString(arr));
        arr = reverseBack(arr);
        System.out.println(Arrays.toString(arr));
     //   System.out.println(Arrays.toString(arr2));
    }

    public static int[] reverseBack(int[] arr){
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length - 1 - i] = arr[i];
        }
        return arr2;
    };

    public static int maxAbs(int[] arr){
        int max=0;
        int mod=0;
        for (int i=0; i< arr.length; i++){
            if ((arr[i]<0)&&((-1*arr[i])>mod))
            {mod = -1*arr[i];
            max = arr[i];}
            if ((arr[i]>0)&&((arr[i])>mod))
            {mod = arr[i];
             max = arr[i];}
        }
        return max;
    };

    public static int numLen(long x){
        int count=0;
        if (x==0) count++;
        if (x<0) {
            x=(-1)*x;
        };
        for (; x>0; x/=10) {
            count++;
        }
        return count;
    };

    public static int[] add(int[] arr, int[] ins, int pos){
        int j=0; int i=0;
        int[] arr2 = new int[arr.length+ins.length];
        for (i = 0; i < arr.length; i++) {
            if (i == pos) {
                for ( j = 0; j < ins.length; j++) {
                    arr2[i+j]= ins[j];
                };
            }
            arr2[i+j]= arr[i];
        };
        return arr2;
    };


    public static int[] add1(int[] arr, int x, int pos)
    {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (i == pos) arr2[i]=x;
            else arr2[i]= arr[i];
        };
        return arr2;
    };

    public static int[] deleteNegative(int[] arr){
        int length=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) length++;
        };
        if (length>0) {
        int[] arr2 = new int[length];
        length=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                arr2[length]=arr[i];
                length++;
            }
        }
        return arr2;}
        else return null;
    };

    public static String chet(int x){
        String res="";
        for (int i=0; i<=x; i+=2) {
           // if ((i==x)||(i==(x-1)))  res+=i;
            res+=i+" ";
        }
        return res.trim();
    };


    public static String reverseListNums(int x)
    {
        String res="";
        for (int i=x; i>=0; i--) {
            if (i==0)  res+=i;
            else res+=i+" ";
        }
        return res;
    };

    public static String listNums(int x){
        String res="";
        for (int i=0; i<=x; i++) {
            if (i==x)  res+=i;
                    else res+=i+" ";
        }
        return res;
    };

    public static int[] findAll(int[] arr, int x){
        int length=0;
        for (int i = 0; i < arr.length; i++) {
           if (x==arr[i]) length++;
        };
        int[] arr2 = new int[length];
        length=0;
        for (int i = 0; i < arr.length; i++) {
            if (x==arr[i]) {
                arr2[length]=i;
                length++;
            }
        }
        return arr2;
    };

    public static int[] concat(int[] arr1, int[] arr2)
    {
        int[] arr = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length+i] = arr2[i];
        }
        return arr;
    };



    public static void reverse(int[] arr){
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length - 1 - i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr2[i];
        }
    };




    public static boolean palindrom(int[] arr){
        int len = arr.length;
        for (int i=0; i< len/2; i++){
            if ((arr[i])!=(arr[len-i-1]))
                return false;
        }
        return true;
    };

    public static int countPositive(int[] arr){
        int res=0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>0) res++;
        }
        return res;
    };




    public static int findFirst(int[] arr, int x){
        for (int i=0; i< arr.length; i++){
            if (x==arr[i]) return i;
        }
        return -1;
    };


    public static int findLast(int[] arr, int x){
        for (int i=arr.length-1; i>=0; i--){
            if (x==arr[i]) return i;
        }
        return -1;
    };



    public static void guessGame() {
        int randomNum = 3;
        int x=0; int count=0;
        do {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            }
            count++;
        } while (x != randomNum);
            System.out.println("Yes, it`s " + randomNum);
            System.out.println("Number of attempt is " + count);
        }


    public static void rightTriangle(int x)
    { int xx=x;
        for (int i=0; i<=x; i++) {
            for (int j=1; j<=xx; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            xx--;
            System.out.println("");
        }
    };

    public static void leftTriangle(int x)
    {
        for (int i=0; i<=x; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    };

    public static void square(int x)
    {
        for (int i=0; i<x; i++) {
            for (int j=0; j<x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    };


    public static boolean equalNum(int x)
    {
        boolean res = false;
        int y = x%10;
        for (; x>0; x/=10) {
          if (x%10==y) {
              res = true;
          }
          else {
              res=false;
              break;};
        }//for
        return res;
    };






    public static int pow(int x, int y){
        int res=1;
        for (int i=1; i<=y; i++) {
            res=res*x;
        }
        return res;
    };








    public static boolean isDivisor (int a, int b){
        return(((b!=0)&&(a%b==0))||((a!=0)&&(b%a==0)));
    };

    public static boolean is2Digits(int x){
        return ((x>9)&&(x<100))||((x<-9)&&(x>-100));
    };


    public static void printDays(String x)
    {
        String res = "";
        switch (x) {
            default: res = "это не день недели"; break;
            case "понедельник": res = "понедельник\n";
            case "вторник": res += "вторник\n";
            case "среда": res += "среда\n";
            case "четверг": res += "четверг\n";
            case "пятница": res += "пятница\n";
            case "суббота": res += "суббота\n";
            case "воскресенье": res += "воскресенье\n";
        }
        System.out.println(res);
    };

    public static String day(int x)
    {String res="это не день недели";
        switch (x) {
        case 1: res = "понедельник"; break;
        case 2: res = "вторник"; break;
        case 3: res = "среда"; break;
        case 4: res = "четверг"; break;
        case 5: res = "пятница"; break;
        case 6: res = "суббота"; break;
        case 7: res = "воскресенье"; break;
    }
        return res;
    };

    public static String age(int x)
    { String res ="";
        int a=x%100; // 2посл цифры
        int b=x%10; // посл цифра
        if ((b==1)&&(a!=11))
            return x + " год";
        if ((b>=2)&&(b<=4)&&(a!=12)&&(a!=13)&&(a!=14))
            return x + " года";
        else return x + " лет";
    };

    public static boolean is35(int x)
    { if (((x%3)==0&&(x%5)!=0)||((x%5)==0&&(x%3)!=0))
        return true;
        else return false;
    };

    public static boolean magic6(int x, int y)
    { if ((x==6)||(y==6)||((x+y)==6)||((x-y)==6)||((y-x)==6))
        return true;
        else return false;
    };

    public static int sum2(int x, int y)
    { if (((x+y)>=10)&&((x+y)<=19))
        return 20;
        else return x+y;
    };

    public static boolean sum3(int x, int y, int z)
    {  boolean res = false;
        if (((x+y)==z)||((x+z)==y)||((y+z)==x)) res = true;
        return res;
    };


    public static int max3(int x, int y, int z)
    {   if ((x>y)&&(x>z)||((x==y)&&(x>z))) return x;
        if ((y>x)&&(y>z)) return y;
        return z;
    };



    public static String makeDecision(int x, int y){
        String res="";
        if (y>x) res = x + "<" +y;
        if (y<x) res = x + ">" + y;
        if (y==x) res = x + "==" + y;
        return res;
    }

    public static int max(int x, int y){
        if (y>x) return (y);
        else return x;
    }

    public static int safeDiv(int x, int y){
        if (y!=0) return (x/y);
        else return 0;
    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }




    public static int abs(int x){
        if (x>0) return x;
        else return -x;
    };

    public static int charToNum(char x) {
        int res = x-48;
        return(res);
    }



    public static boolean isEqual (int a, int b, int c){
        return a == b && a == c;
    };





    public static boolean isInRange(int a, int b, int num){
        return ((num>=a)&&(num<=b))||((num>=b)&&(num<=a))  ;
    };




    public static boolean isUpperCase(char x){
        return ((x>='A')&&(x<='Z'));
    };





    public static boolean isPositive(int x) {
        boolean res = x>0;
        return(res);
    };







    public static int sumLastNums(int x){
        int lastn = x%10; // получаем посл.цифру
        int firstn = x/10; // избавляемся от посл. цифры
        firstn = firstn%10; // получаем предпосл.цифру
        int res = lastn  + firstn;
        return(res);
    };


    public static double fraction(double x){
        double res =  x - (int)x;
        return(res);
    }
}


      /*  System.out.println("Введите первое число:");
      double x = new Scanner(System.in).nextDouble();

              System.out.println("Введите СИМВОЛ:");
        int x = new Scanner(System.in).nextInt();

        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();
        int result =number1+number2;
        System.out.println("Сумма чисел= " + result);
        result = number1 - number2;
        System.out.println("Разность чисел= " + result);
        result = number1*number2;
        System.out.println("Произведение чисел= " + result);
        double result1 = (double)number1/number2;
        System.out.println("Частное от чисел= " + result1);*/