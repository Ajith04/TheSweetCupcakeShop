package Models;

public class Cupcake {
    private String Name;
    private String Flavor;
    private String Category;
    private double Price;

    public Cupcake() {
    }

    public String getName() { return Name; }
    public String getFlavor() { return Flavor; }
    public String getCategory() { return Category; }
    public double getPrice() { return Price; }
    
    public void setName(String name) {
        this.Name = name;
    }

    public void setFlavor(String flavor) {
        this.Flavor = flavor;
    }

    public void setCategory(String category) {
        this.Category = category;
    }

    public void setPrice(double price) {
        this.Price = price;
    }
    
   

}
