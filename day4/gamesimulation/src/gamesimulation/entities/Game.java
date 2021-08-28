
package gamesimulation.entities;

public class Game {
    String name;
    String id;
    Double price;

     public Game(String name, String id, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

   
}
