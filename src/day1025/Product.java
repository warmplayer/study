package day1025;

public class Product {
    String name;
    Sale sale;

    public Product(Sale sale) {
        this.name = "红牛饮料";
        this.sale = sale;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }


}
class Sale{
    int price;
    int sales[];

    public Sale(int price, int sales[]) {
        this.price = price;
        this.sales = sales;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int[] getSales() {
        return sales;
    }

    public void setSales(int sales[]) {
        this.sales = sales;
    }
}
class Test_2{
    public static void main(String[] args) {
        int[] sales = {90,80,70,60,50,90,80,70,60,50,90,80,70,60,50,90,80,70,60,50,90,80,70,60,50,90,80,70,60,50};
        int num= 0;
        Product product = new Product(new Sale(10,sales));
        for (int i = 0; i < product.getSale().getSales().length; i++) {
            num = num+product.getSale().getSales()[i];
        }

        System.out.println("30天销售总额:\n"+num*product.getSale().getPrice());
    }
}