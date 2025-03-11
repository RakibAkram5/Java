public class BasicProblem {
    public static void main(String[] args){
        System.out.println("Hello World.");
        int num1=5,num2=10;
        int sum=num1+num2;
        System.out.println("Sum: " +sum);
        int number=7;
        if(number%2==0){
            System.out.println(number+ " is Even.");
        }
        else{
            System.out.println(number+ " is ODD");
        }
        int a=5,b=10,temp;
        System.out.println(a+" and "+b+ " Before Swapping.");
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+" and "+b+" After Swapping.");
        int n=12,n2=23,n3=32,largest;
        if(n>n2){
            if(n>n3){
                largest=n;
            }
            else{
                largest=n3;
            }
           
        }
        else{
            if(n2>n3){
                largest=n2;
            }
            else{
                largest=n3;
            }
        }
        System.out.println("Largest: "+largest);
        int factNumber=5;
        int fact=1;
        for(int i=1;i<=factNumber;i++){
            fact*=i;
        }
        System.out.println("Factorial of Number: "+fact);
    }
    
}
