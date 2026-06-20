class order{
    int orderId;
    String customerName;
    double totalPrice;

    order(int orderId,String customerName,double totalPrice){
        this.orderId=orderId;
        this.customerName=customerName;
        this.totalPrice=totalPrice;
    }
      @Override
    public String toString(){
        return "Order ID: " + orderId +
               ", Customer: " + customerName +
               ", Total Price: " + totalPrice;
    }
}

class bubblesort{
    public static void sort(order[] orders){
        int n=orders.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;i++){
                if(orders[j].totalPrice > orders[j+1].totalPrice){
                    order temp=orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=temp;
                }
            }
        }
    }
}
 
 class Quicksort{
    static int partition(order[] orders,int low,int high){
        double pivot=orders[high].totalPrice;
        int i=low-1;

        for(int j=low;j<high;j++){
            if(orders[j].totalPrice<pivot){
                i++;
                order temp=orders[i];
                orders[i]=orders[j];
                orders[j]=temp;

            }
        }
        order temp=orders[i+1];
        orders[i+1]=orders[high];
        orders[high]=temp;

        return i+1;
    }

    static void quickSort( order[] orders,int low,int high){
        if(low<high){
            int p=partition(orders, low, high);

            quickSort(orders, low, p-1);

            quickSort(orders, p+1, high);
        }
    }
 }
 class customerOrder{
    public static void main(String[] args) {
        order[] orders = {

            new order(
                101,
                "Ram",
                5000),

            new order(
                102,
                "Sam",
                3000),

            new order(
                103,
                "John",
                8000)
        };

        bubblesort.sort(orders);
        System.out.println("bubble sort");
        for(order o : orders){
            System.out.println(o);
        }
        Quicksort.quickSort(orders, 0, orders.length-1);
        System.out.println("\nQuick sort");
        for(order o : orders){
            System.out.println(o);
        }

    }
 }

