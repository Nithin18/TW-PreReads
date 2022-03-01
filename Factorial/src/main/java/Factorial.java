public class Factorial {
    public static long findFactorial(int number){
        if(number == 0){
            return 1;
        }
        if(number<0 || number>20){
            return 0;
        }
        if(number<=2){
            return number;
        }

        long factorial = 1;
        for(int i=2;i<=number;i++){
            factorial *= i;
        }

        return factorial;
    }
}
