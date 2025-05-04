public class setzeroes {
    static void method(int[] [] arr){
        int n = arr.length;
        int m = arr[0].length;
        boolean fr = false , fc = false;
        for(int i=0;i<n;i++){
            for(int j =0 ; j<m;j++){
                if(arr[i][j] == 0){
                    if(i==0)fr= true;
                    if(j==0)fc = true;
                    arr[0][j] = 0;
                    arr[i][0] = 0;

                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j =1;j<m;j++){
                if( arr[i][0] ==0 || arr[0][j] ==0 ){
                    arr[i][j] = 0;
                }
            }
        }
        if(fr){
            for(int j=0;j<m;j++){
                arr[0][j] = 0;
            }
        }
        if(fc){
            for(int i=0;i<n;i++){
                arr[i][0] = 0;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(arr[i][j]);
            }
        }

        
    }
    public static void main(String[] args) {
        int [][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        method(arr);

    }
    
}
