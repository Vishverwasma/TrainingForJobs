public class ArrayQuestion {
    int[] arr = {5,10,12,20,25};
    int num = 15 , position = 3;
    public void show(){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("---------------------------------");
    }
    public void insertAtFirst(){
        arr[0]=num ;
    }
    public void insertAtLast(){
        arr[arr.length-1]=num;
    }
    public void insertAtPosition(){
        arr[position-1]=num;
    }

    public static void main(String[] args) {
        ArrayQuestion o = new ArrayQuestion();
        o.show();
        o.insertAtFirst();
        o.show();
        o.insertAtLast();
        o.show();
        o.insertAtPosition();
        o.show();
    }
}
