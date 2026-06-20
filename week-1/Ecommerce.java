
class product{
    int productId;
    String productName;
    String category;


product(int productId, String productName,String category){
       this.productId=productId;
       this.productName=productName;
       this.category=category;
}
}

class LinearSearch{
    public static product search(product[] products,int targetID){
        for(product p : products){
            if(p.productId==targetID){
                return p;
            }
        }
                return null;
            }
        }
    


class BinarySearch{
    public static product search(product[] products,int targetId){
        int low=0;
        int high=products.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(products[mid].productId==targetId){
                return products[mid];
            }
            if(products[mid].productId<targetId){
                low=mid+1;
            }else{
                high=mid-1;

            }
        }
        return null;
    }
}
public class Ecommerce{
    public static void main(String[] args) {
        product[]Products={
             new product(101,"Laptop","Electronics"),
            new product(102,"Mouse","Electronics"),
            new product(103,"Keyboard","Electronics"),
            new product(104,"Monitor","Electronics"),
            new product(105,"Printer","Electronics")
        };

        product result=LinearSearch.search(Products,101);

        if(result!=null){
            System.out.println("Linear search Found : "+result.productName);
        }

        product result1=BinarySearch.search(Products,102);
        if(result1!=null){
            System.out.println("Binary search Found : "+result1.productName);
        }

               
        }
    }
