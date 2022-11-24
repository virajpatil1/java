
class bitwise {
    public static int checkbit(long A, int B){

      if((A & (1 << B)) == (1 << B)){
           return 1;
       }else{
           return 0;
       }

   }
   public static void main(String[] args) {
       long A =93;
       int B = 4;
       double sum =0;
       long ans=0;
       //System.out.println( A & (1 << 4));
       long C = (A >> B);
       //System.out.println( C);
       //long D = (A >> B)
       System.out.println( A & (1 << 4));
       for(int i=0;i<B;i++){
           
           if(checkbit(A,i) == 1){
           sum = sum +  Math.pow(2,i);
       }
       }
       ans = A - Math.round(sum);
       System.out.println("sum :"+sum);
       System.out.println("Answer: "+ans);
   }
}