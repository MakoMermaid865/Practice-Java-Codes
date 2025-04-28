import java.util.ArrayList;
import java.util.Scanner;

public class CallProduct {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Product> productList = new ArrayList<Product>();
      int currPrice;
      String currName;
      int i;
      Product resultProduct;

      currPrice = scnr.nextInt();
      while (currPrice >= 0) {
         resultProduct = new Product();
         currName = scnr.next();
         resultProduct.setPriceAndName(currPrice, currName);
         productList.add(resultProduct);
         currPrice = scnr.nextInt();
      }

      resultProduct = productList.get(0);

      for (i = 0; i < productList.size(); ++i) {
         if (productList.get(i).getPrice() < resultProduct.getPrice()) {
            resultProduct = productList.get(i);
         }
      }

      System.out.println("$" + resultProduct.getPrice() + " " + resultProduct.getName());
   }
}
public class Product {
   private int price;
   private String name;

   public void setPriceAndName(int productPrice, String productName) {
      price = productPrice;
      name = productName;
   }

   public int getPrice() {
      return price;
   }

   public String getName() {
      return name;
   }
}
//Input
//10 Tuna
//6 Flowers
//12 Shirt
//-1

//Output
//$6 Flowers
