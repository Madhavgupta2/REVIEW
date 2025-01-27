    import java.util.*;
    class ADD{
    public static void main(String[] args) {
        int arr[]={1,23,3,3,4,5};
        int r=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    r=arr[i];
                }
            }
        }
        if(r==0){
            System.out.print("no duplicate");
        }
        else{
            System.out.print(r);
        }
    }
    }