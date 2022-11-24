class hello {
    public static void main(String[] args) {
        int a[]= {1,4,2};
        int count = 0;
        int tol = 0;
        int n =a.length;
        int val=4;
        
        
        for(int j=0;j<n;j++){
            
            if(a[j] == val){
                tol++;
            }
        }
        //System.out.println("tol : "+tol);
        
        
        if(tol == 0){
            System.out.println("val is not present in the array :"+ -1);
        }else{
            for(int i=0;i<n;i++){
            
            if(a[i] > val){
                count++;
            }
        }
          System.out.println("remove number of elements grater than value :"+ count);  
        }
        
        System.out.println("End");
        
    }
}