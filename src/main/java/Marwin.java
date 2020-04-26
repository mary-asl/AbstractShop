import lesson.AbstractShop;

public class Marwin extends AbstractShop {
 private String location;

 Marwin(String location){
     this.location =location;
 }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
